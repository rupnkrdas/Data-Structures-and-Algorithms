package com.rupankar;

public class Output {
    public static void main(String[] args) {
        System.out.println(56);
        Integer num = new Integer(56); // converting to wrapper Class
        System.out.println(num.toString()); // its the same thing
        // primitives are stored in stack memory and objects are stored in heap memory
        // This println() is taking integer as an input
        // 'println()' calls 'valueof()'
        // 'valueof()' returns 'Integer.toString()'
        // what it actually means is, you have it as an integer, give me the String
        // value and I will print it
        // out is a variable of type 'PrintStream'
        // PrintStream is a class
        // PrintStream has a method in it called 'println()'

        System.out.println("Rupankar");
        // This println() is taking String as an input
        // for String, it is just printing the value of it

        System.out.println(new int[] { 1, 2, 4 });
        // This println() is taking an Object type as an input
        // an Object can be of any type
        // Java doesn't know what to print
        // for every Object, there is default representation adding @ and 'hashcode'
        // we don't want to use this .toString()
        // thatswhy we use Arrays.toString()
        // the Object can't be 'null'
        // 'null.toString()' will print 'null' on the console
        // you have it as an array(object), give me its String value, it will print it

        // 'println()' taking different types of inputs and performing correspondingly
        // shows 'function overloading'
        // 'println()' will ultimately print the String value only on the console
    }
}
