package com.chakura.timemaster.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

@Slf4j
public final class DateUtil extends DateUtils {

    private DateUtil() {

    }

    public static final String DATE_TIME = "yyyy-MM-dd HH:mm:ss";

    public static final String DATE = "yyyy-MM-dd";

    public static final String WEB_DATE = "yyyy/MM/dd";

    public static final String DATE_NO_DASH = "yyyyMMdd";

    public static String datetimeToString(LocalDateTime dateTime) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern(DATE_TIME);
        return df.format(dateTime);
    }

    public static String dateToString(LocalDate date) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern(DATE);
        return df.format(date);
    }

    public static String dateToString(LocalDateTime date, String patten) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern(patten);
        return df.format(date);
    }

    public static String formatDate(Date d, String patten) {
        if (d == null) {
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(patten);
        try {
            return sdf.format(d);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return "";
    }

    public static Date parseDate(String d, String patten) {
        try {
            return DateUtils.parseDate(d, patten);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return null;
    }


    public static LocalDateTime getStartDateTimeByMonth(int month) {
        LocalTime startTime = LocalTime.of(0, 0, 0);
        LocalDate date = LocalDate.now();
        LocalDate startDate = LocalDate.of(date.getYear(), date.getMonth(), 1);
        LocalDate rs = startDate.plusMonths(month);
        return LocalDateTime.of(rs, startTime);
    }

    public static LocalDateTime getEndDateTimeByMonth(int month) {
        LocalTime startTime = LocalTime.of(23, 59, 59);
        LocalDate date = LocalDate.now();
        LocalDate rs = date.plusMonths(month);
        LocalDate with = rs.with(TemporalAdjusters.lastDayOfMonth());
        return LocalDateTime.of(with, startTime);
    }

    public static String dateLongToString(Long time, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date date;
        try {
            date = sdf.parse(sdf.format(time));
            return sdf.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean equalYearAndMonth(LocalDate d1, LocalDate d2) {
        int m1 = d1.getMonthValue();
        int y1 = d1.getYear();
        int m2 = d2.getMonthValue();
        int y2 = d2.getYear();
        return m1 == m2 && y1 == y2;
    }

    public static LocalDateTime dateToLocalDateTime(Date date) {
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        return instant.atZone(zoneId).toLocalDateTime();
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
