package com.example.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
       /* List<String> myList= new ArrayList<>();
        myList.add("hi");
        myList.add("hello");
        myList.add("hey");
        myList.add("helloworld"); */

        List<String> names= Arrays.asList("hi","hello","hey","helloworld");
/*
        for(String s:names){
            if(s.length()>3){
                System.out.println(s);
            }
        }*/

        //names.stream().filter(s->s.length()>3).forEach(System.out::println);
        names.forEach(System.out::println);

        List<Integer> integerList= Arrays.asList(12,14,17,18,20,22,23,45,56);

       //s integerList.forEach(i->System.out.println(i));

        integerList.stream().filter(i->i%2==0).forEach(System.out::println);

        //names.stream().map(s->s.toUpperCase()).forEach(System.out::println);

        names.stream().filter(s->s.length()>3).map(s->s.toUpperCase()).forEach(System.out::println);

        // functional interfaces in java8: Predicate,Consumer,Function etc.

        // multiply each element by 2



       List<Integer> afterMultiply= integerList.stream().map(i->i*2).collect(Collectors.toList());

       int c= add(10,20);

        afterMultiply.forEach(System.out::println);

    }

    public static int add(int a,int b){
        return a+b;
    }
}
