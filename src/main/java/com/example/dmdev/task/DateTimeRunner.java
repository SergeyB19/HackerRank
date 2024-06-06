package com.example.dmdev.task;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTimeRunner {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.toEpochMilli());
        System.out.println(Instant.ofEpochMilli(0));
        System.out.println(instant.atZone(ZoneId.of("Africa/Tunis")));
        System.out.println(instant.plus(1, ChronoUnit.HOURS));
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        localDateTime.plus(1, ChronoUnit.MONTHS);

        Duration duration = Duration.ofDays(1);
        System.out.println(duration.getSeconds());
        Period period = Period.of(1, 2, 25);
        System.out.println(period.plusDays(5));

    }
}
