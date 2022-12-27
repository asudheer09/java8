package com.example.employee;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> data= Optional.ofNullable(null);
        String d= data.orElse("default value");
        System.out.println(d);

       // data.orElseThrow(NullPointerException::new);

        data.orElseThrow(()-> new NullPointerException("data has null value"));

       // functional interface--> lambda or method reference

    }
}
