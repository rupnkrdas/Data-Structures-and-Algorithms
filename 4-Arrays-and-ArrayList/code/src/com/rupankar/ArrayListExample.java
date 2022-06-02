package com.rupankar;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String args[]) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        // also ArrayList<Integer> list = new ArrayList<Integer>(); but defining the
        // datatype is not necessary
        // ArrayList is a class
        // we cannot pass primitives, we need to pass Wrapper class
        list.add(67);
        list.add(234);

        System.out.println(list);
        // it is internally calling toString method

        System.out.println(list.contains(67));

        list.set(0, 99);
        System.out.println(list);

    }
}