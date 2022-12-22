package com.example.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExampleForNumbers {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int[] A={1,2,3,9,4,5,7,3,1,2,13,11,7,0};
        //float[] B={1,2,3,9,4,5,7,3,1,2,13,11,7};

        int max= Arrays.stream(A).max().getAsInt();
        int min= Arrays.stream(A).min().getAsInt();
        int sum=Arrays.stream(A).sum();
        System.out.println("max= "+max);
        System.out.println("min= "+min);
        System.out.println("sum= "+sum);
        double avg=Arrays.stream(A).average().getAsDouble();
        System.out.println("avg= "+avg);

        /*int asum=0;
        for (int i:A  ) {
            asum=asum+i;
        }*/

        //System.out.println(asum);

        int imax=0;

        /*for (int i = 0; i < A.length; i++) {
            if(A[i]>imax){
                imax=A[i];
            }
        }

        System.out.println(imax);*/

        //remove duplicates in array

        Arrays.stream(A).distinct().forEach(System.out::println);

        List<String> names= Arrays.asList("abc","def","ghi","jkl","abc","abcdfe","dsfsdf","sfsdfdsf");

        //names.stream().distinct().forEach(System.out::println);

       // names.stream().map(s->s.toUpperCase()).forEach(System.out::println);
        //names.stream().filter(s -> s.length()>3).map(s -> s.toUpperCase()).forEach(System.out::println);

        // to sort
        names.stream().sorted().forEach(System.out::println); // it will sort
        System.out.println(names.stream().findFirst().get()); // it gets first element
        System.out.println(names.stream().distinct().count()); //counts after removes duplicate
       // names.stream().limit(3).forEach(System.out::println); // it gets first 3 elements

       // List<String> myNewList=names.stream().filter(s->s.length()>3).map(s->s.toUpperCase()).collect(Collectors.toList());

       // myNewList.forEach(System.out::println);
        System.out.println("========================================");
        names.stream().skip(2).forEach(System.out::println);// skip no of elements.
    }

    public String print(String x){
        return x.toUpperCase();
    }

    //(x)->x.toUpperCase();
}
