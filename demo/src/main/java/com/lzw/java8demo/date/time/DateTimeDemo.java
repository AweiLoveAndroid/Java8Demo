package com.lzw.java8demo.date.time;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

    public static void main(String[] args) {

        // java8的日期类通过指定一个时区，然后就可以获取到当前的时刻，日期与时间。
        // Clock可以替换System.currentTimeMillis()与TimeZone.getDefault()
        Clock clock = Clock.systemUTC();


        // 一个Instant对象表示时间轴上的一个时间点，
        Instant instant = clock.instant();
        System.out.println("clock.instant() --> " + instant.toString());
        System.out.println("===================================");


        // Instant.now()方法会返回当前的瞬时点（格林威治时间）
        Instant instantNow = Instant.now();
        System.out.println("Instant.now() --> " + instantNow.toString());
        System.out.println("===================================");


        // Duration用于表示两个瞬时点相差的时间量
        // Duration duration = Duration.between();
        // System.out.println("===================================");


        // LocalDate 一个带有年份，月份和天数的日期，可以使用静态方法now或者of方法进行创建
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate.now() --> " + localDate.toString());
        LocalDate ofLocalDate = LocalDate.of(2018, 4, 22);
        System.out.println("LocalDate.of(2018, 4, 22) --> " + ofLocalDate.toString());
        System.out.println("===================================");


        // LocalTime:表示一天中的某个时间，同样可以使用now和of进行创建
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime.now() --> " + localTime.toString());
        LocalTime ofLocalTime = LocalTime.of(23 ,24 ,0);
        System.out.println("LocalTime.of(23 ,24 ,0) --> " + ofLocalTime.toString());
        System.out.println("===================================");


        // LocalDateTime：兼有日期和时间
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime.now() --> " + localDateTime.toString());
        LocalDateTime ofLocalDateTime = LocalDateTime.of(2018, 4, 22, 23 ,24 ,0);
        System.out.println("LocalDateTime.of(2018, 4, 22, 23 ,24 ,0) --> " + ofLocalDateTime.toString());
        System.out.println("===================================");


        // ZonedDateTime：通过设置时间的id来创建一个带时区的时间
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime.toString());
        System.out.println("===================================");


        // DateTimeFormatter：日期格式化类，提供了多种预定义的标准格式
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd:HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse("2018-04-22:23:24:00", formatter);
        System.out.println("DateTimeFormatter格式化日期 --> " + "\n"
                + "格式化之前 --> " + "2018-04-22:23:24:00" + "\n"
                + "格式化之后 --> " + dateTime.toString());

    }
}
