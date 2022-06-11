package com.rupankar;

public class Strings {
    public static void main(String[] args) {
        String name = "Rupankar";
        // everything that starts with a capital letter is a class in java
        // here String is the data type
        // name is the reference variable
        // "Rupankar" is the object

        // String pool is a separate memory location inside the heap
        // all the similar values are not recreated in the heap
        // String pool makes our program more optimized
        // if we say 10 reference variables are equal to Rupankar, it wont create 10
        // different objects of Rupankar
        // Strings are immutable in java for security reaosons

        String a = "Roop";
        System.out.println(a);
        a = "roop";
        System.out.println(a);
        System.out.println(name);

    }
}
