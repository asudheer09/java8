package com.example.employee;

import java.util.*;
import java.util.stream.Collectors;

public class TestRealTimeData {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        // find no of male and female employees
        Map<String, Long> noOfMaleFemale = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(noOfMaleFemale);

        //print all the departments in the organization
        employeeList.stream().map(e -> e.department).collect(Collectors.toList()).forEach(System.out::println);

        //what is the average age of the male and female employees?

        Map<String, Double> avgAgeOfMaleFemale = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        System.out.println(avgAgeOfMaleFemale);

        // find the highest salary of an employee
        Optional<Employee> employee = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

        if (employee.isPresent()) {
            Employee e = employee.get();
            System.out.println(e);
        }

        //get the names of all the employees who has joined after 2015

        employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(e -> e.getName()).collect(Collectors.toList()).forEach(System.out::println);

        // what is the average salary in each department.

        Map<String, Double> data = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(data);

        //count the no of employees in each department

        Map<String, Long> myData = employeeList.stream().collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting()));

        System.out.println(myData);

        //find the youngest male in product development department

        Optional<Employee> employee1 = employeeList.stream().filter(e -> "Male".equals(e.gender) && "Product Development".equals(e.getDepartment())).min(Comparator.comparingInt(Employee::getAge));

        if (employee1.isPresent()) {
            System.out.println(employee1.get().getName());
        }

        // who has most working experience

        Employee employee2 = employeeList.stream().sorted(Comparator.comparingLong(Employee::getYearOfJoining)).findFirst().get();
        System.out.println(employee2);
    }
}
