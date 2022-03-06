package com.chakura.timemaster.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.UUID;

public class DigestUtil {

    private DigestUtil() {}

    public static String getSha256Hex(String text) {
        return DigestUtils.sha256Hex(text);
    }

    public static String generateSalt() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 7);
    }
}
