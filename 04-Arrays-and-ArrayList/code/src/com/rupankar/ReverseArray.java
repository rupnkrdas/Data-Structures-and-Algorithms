package com.rupankar;

import java.util.Arrays;

/**
 * ReverseArray
 */
public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 9, 18 };
        System.out.println("array before reversal: " + Arrays.toString(arr));
        System.out.println("array after reveral: " + Arrays.toString(reverse(arr)));
    }

    static int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

        return arr;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}