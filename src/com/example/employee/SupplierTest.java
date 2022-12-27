package com.example.employee;

import java.util.function.Consumer;
import java.util.function.Supplier;

/*class Mysuplier implements Supplier<String>{
    @Override
    public String get() {
        return "hello supplier";
    }
}*/



public class SupplierTest {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello supplier";
        Consumer<String> consumer = (s)->System.out.println(s);

        String data=supplier.get();
        System.out.println(data);
    }

}
