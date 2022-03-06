package com.chakura.timemaster.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

@Slf4j
public class StringUtil {

    private StringUtil() {
    }

    public static String trim(Object obj) {
        return obj == null ? "" : StringUtils.trim(obj.toString());
    }

    public static boolean isEmpty(String obj) {
        return StringUtils.isEmpty(obj);
    }

    public static String capitalize(String obj) {
        return StringUtils.capitalize(obj);
    }

    public static boolean isBlank(Object obj) {
        return obj == null || StringUtils.isBlank(obj.toString());
    }

    public static boolean isNotBlank(Object obj) {
        return obj != null && StringUtils.isNotBlank(obj.toString());
    }

    public static <T> String listToString(List<T> list, String separator) {
        if (CollectionUtils.isEmpty(list)) {
            return StringUtils.EMPTY;
        }
        return StringUtils.join(list.toArray(), separator);
    }

    public static <T> String setToString(Set<T> set, String separator) {
        return StringUtils.join(set.toArray(), separator);
    }

    public static List<String> stringToList(String str, String separator) {
        List<String> res = new ArrayList<>(Arrays.asList(str.split(separator)));
        res.remove("");
        return res;
    }

    public static Set<String> stringToSet(String str, String separator) {
        Set<String> res = new HashSet<>(Arrays.asList(str.split(separator)));
        res.remove("");
        return res;
    }

    public static List<String> splitBySquareBrackets(String str) {
        str = trim(str);
        if (StringUtils.isEmpty(str)) {
            return new ArrayList<>();
        }
        if (str.startsWith("[") && str.endsWith("]")) {
            str = str.substring(1, str.length() - 1);
            return new ArrayList<>(Arrays.asList(str.split("\\]\\[")));
        }
        return new LinkedList<>(Arrays.asList(str));
    }

    public static String joinBySquareBrackets(List<?> list) {
        String str = StringUtils.join(list.toArray(), "][");
        if (!str.isEmpty()) {
            str = "[" + str + "]";
        }
        return str;
    }

    public static String joinBySquareBrackets(Set<String> list) {
        String str = StringUtils.join(list.toArray(), "][");
        if (!str.isEmpty()) {
            str = "[" + str + "]";
        }
        return str;
    }

    public static boolean isUrl(String str) {
        if (StringUtil.isBlank(str)) {
            return false;
        }

        if (str.indexOf('.') == -1) {
            return false;
        }

        String p = "^(?:https?://)[\\w-]{1,}(?:\\.?[\\w]{1,})+[\\w-_/?&=#%:\\.]*$";
        Pattern pattern = Pattern.compile(p);
        return pattern.matcher(str).matches();
    }

    public static boolean containChinese(String str) {
        if (StringUtil.isEmpty(str)) {
            return false;
        }

        Pattern pattern = Pattern.compile("[\u4e00-\u9fa5]");
        return pattern.matcher(str).find();
    }

    public static String removeDuplicateString(String str1, String str2) {
        if (StringUtil.isBlank(str1)) {
            return null;
        }
        if (StringUtil.isBlank(str2)) {
            return str1;
        }
        char[] chars = str2.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
            if (c == ']') {
                str1 = StringUtils.replace(str1, sb.toString(), "");
                sb.delete(0, sb.length());
            }
        }
        return str1;
    }
}
