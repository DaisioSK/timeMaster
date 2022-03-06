package com.chakura.timemaster.util;

import lombok.extern.slf4j.Slf4j;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

@Slf4j
public class CryptoUtil {
	private CryptoUtil() {}

	private static final String KEY_ALGORITHM = "AES";
	private static final String DEFAULT_CIPHER_ALGORITHM = "AES/GCM/NoPadding";// 默认的加密算法

	public static String encrypt(String content, String encryptPass) {
		try {
			byte[] iv = new byte[12];
			SecureRandom secureRandom = new SecureRandom();
			secureRandom.nextBytes(iv);
			byte[] contentBytes = content.getBytes(StandardCharsets.UTF_8);
			Cipher cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);
			GCMParameterSpec params = new GCMParameterSpec(128, iv);
			cipher.init(Cipher.ENCRYPT_MODE, getSecretKey(encryptPass),params);
			byte[] encryptData = cipher.doFinal(contentBytes);
			assert encryptData.length == contentBytes.length + 16;
			byte[] message = new byte[12 + contentBytes.length + 16];
			System.arraycopy(iv, 0, message, 0, 12);
			System.arraycopy(encryptData, 0, message, 12, encryptData.length);
			return Base64.getEncoder().encodeToString(message);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}

	public static String decrypt(String base64Content, String encryptPass) {
		try {
			byte[] content = Base64.getDecoder().decode(base64Content);
			if (content.length < 12 + 16)
				throw new IllegalArgumentException();
			GCMParameterSpec params = new GCMParameterSpec(128, content, 0, 12);
			Cipher cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);
			cipher.init(Cipher.DECRYPT_MODE, getSecretKey(encryptPass), params);
			byte[] decryptData = cipher.doFinal(content, 12, content.length - 12);
			return new String(decryptData, StandardCharsets.UTF_8);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}

	private static SecretKeySpec getSecretKey(String encryptPass) throws NoSuchAlgorithmException {
		KeyGenerator kg = KeyGenerator.getInstance(KEY_ALGORITHM);
		// 初始化密钥生成器，AES要求密钥长度为128位、192位、256位
		SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
		secureRandom.setSeed(encryptPass.getBytes());
		kg.init(128, secureRandom);
		SecretKey secretKey = kg.generateKey();
		return new SecretKeySpec(secretKey.getEncoded(), KEY_ALGORITHM);// 转换为AES专用密钥
	}

	public static void main(String[] args) {
		String key = "1234";
		String encrypt = CryptoUtil.encrypt("abcd1234", key);
		System.out.println(encrypt);
		System.out.println(CryptoUtil.decrypt(encrypt, key));
	}
}
