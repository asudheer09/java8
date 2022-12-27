package com.example.employee;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Optional;
import java.util.Set;
import java.util.List;
import java.util.stream.Collectors;

public class OrElseThrowExample {
    public static void main(String[] args) {
        /*Optional<String> data = Optional.of("hello");
        data.orElseThrow(IllegalArgumentException::new);
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        String zone = zoneIds.stream().findFirst().get();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of(zone));
        System.out.println(zonedDateTime);
        List<String> list1 = Arrays.asList("hi", "hello");
        List<String> list2 = Arrays.asList("hey", "hehe");
        List<List<String>> listList = Arrays.asList(list1, list2);

        List<String> p = listList.stream().flatMap(d -> d.stream()).collect(Collectors.toList());
        System.out.println(p);*/
        int x=5;
        boolean b1=true;
        boolean b=false;

        if((x==4) && !b)
            System.out.println("1");
        System.out.println("2");
        if((b=true && b1 ))
            System.out.println("3");



    }
}
