package com.rupankar;

public class Main {
    public static void main(String[] args) {
        // syntax of arrays
        // datatype[] variable_name = new datatype[size];
        // store 5 rnos
        int[] rnos = new int[5];
        // or directly
        int[] rnos2 = { 23, 12, 45, 32, 15 };

        int[] ros; // declaration of array, ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here the object is being created in the memory(heap)

        // in java there is no continuous memory allocation in arrays
        // 1. array objects are in heap
        // 2. heap objects are not continuous
        // declaration happens at compile time
        // actual allocation of memory is done during runtime
        // dynamic memory allocation: memory is allocated during runtime
        // array objects may not be continuous (depends on JVM)
        // index represents the position of an object in an array
        // 'new' is used to create an object
        // by default, an integer array is going to have all elements initialised to 0
        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}