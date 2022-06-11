package com.rupankar;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 12 };
        change(nums); // copy of the reference variable is passed in the function 'change'
        // Strings are immutable in java whereas arrays are mutable in java
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}