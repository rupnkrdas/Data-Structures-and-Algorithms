package com.rupankar;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives
        // int[] arr = new int[5];

        // // input using for loops
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = in.nextInt();
        // }

        // for (int element : arr) { // for every integer element in the array, print
        // the element
        // System.out.println(element + " ");
        // }

        // System.out.println(Arrays.toString(arr));

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        in.close();
    }
}