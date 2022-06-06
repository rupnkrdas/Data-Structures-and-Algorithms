package com.rupankar;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));

        // when doing addition with characters, it takes the ascii values and does the
        // operation
        // with Strings, it takes String values

        System.out.println("a" + 1);
        // String won't be converted to ascii value
        // It will print "a1"
        // when an integer is added to a String, the integer is converted to Integer
        // that will call .toString()
        // this is same as after a few steps: "a" + "1"

        System.out.println("Rupankar" + new ArrayList<>());

        // the operator '+' in java is only defined for primitives and when any one of
        // the values is a String
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);
    }
}
