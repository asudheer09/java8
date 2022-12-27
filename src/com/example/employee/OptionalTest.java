package com.example.employee;

import java.util.ArrayList;
import java.util.List;

public class OptionalTest {

    List<Employee> employeeList1;
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));


        /*try {
            String s = null;
            System.out.println(s.length());//NPE
        }catch(Exception e){
            e.printStackTrace();
        }

        Employee employee=null;
        System.out.println(employee.getName());*/
        List<Employee> employeeList1;
        List<Employee> employeeList2= new ArrayList<>();

        //System.out.println(employeeList1.size());
       // System.out.println(employeeList2.size());

        if(employeeList !=null && !employeeList.isEmpty()){
            employeeList.forEach(System.out::println);
        }

        OptionalTest test= new OptionalTest();

        System.out.println(test.employeeList1.size());

        // int 0, float 0.0 double 0.0, long 0

    }
}
