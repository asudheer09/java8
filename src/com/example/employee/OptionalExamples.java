package com.example.employee;

import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {

        String s=null;
        Optional<String> myData= Optional.of("hello");
        Optional<Employee> myEmp= Optional.of(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));

        if(s!=null){
            System.out.println(s);
        }

        if(myData.isPresent()){
            System.out.println(myData.get());
        }


        if(myEmp.isPresent()){
            Employee employee=myEmp.get();
            System.out.println(employee);
        }

        Optional<String> something= Optional.empty();
        Optional<String> name= Optional.ofNullable(null);
        //Optional<String> MyName= Optional.of(null);

        //System.out.println(something.get());
        //System.out.println(name.get());
       // System.out.println(MyName.get());

        Optional<String> department= Optional.ofNullable("sudheer");
        department.ifPresent(s1 -> System.out.println(s1.toUpperCase()));

        Optional<String> data=Optional.ofNullable(null);

        System.out.println(data.orElse("some data"));




    }
}
