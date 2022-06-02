package com.rupankar;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Rupankar Das";

        // there is no pass by reference in java, there is only pass by value
        greet(name);

        change(name);
        System.out.println(name);

        // both souts will print "Rupankar Das" on the command line
    }

    static void change(String name) {
        name = "Rahul"; // creating a new object i.e. "Rahul", not changing the previous object i.e.
                        // "Rupankar Das"
    }

    static void greet(String naam) {
        System.out.println(naam);
    }
}