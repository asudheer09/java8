package com.example.employee;

import java.time.*;
import java.util.Date;
import java.util.Set;

public class Java8DateTime {
    public static void main(String[] args) {
        Date date = new Date(); // mutable, present in 2 packages, it is given time also
        System.out.println(date);
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2023, 1,1);
        //LocalDate localDate1 = LocalDate.of(2023, Month.JANUARY,1);

        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());
        System.out.println(localDate.getDayOfMonth());

        LocalTime localTime= LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.minusHours(1));
        System.out.println(localTime.plusMinutes(3));


        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println(localDateTime);

        Set<String> zones=ZoneId.getAvailableZoneIds();
        zones.forEach(System.out::println);
        zones.forEach((z)->System.out.println(z));

        LocalDateTime localDateTime1= LocalDateTime.now(ZoneId.of("Israel"));
        System.out.println(localDateTime1);



    }
}
