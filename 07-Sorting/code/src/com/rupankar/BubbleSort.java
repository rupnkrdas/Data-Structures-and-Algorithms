package com.rupankar;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { -79, 0, -11, 32, 44, 12 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean swapped = false;
        int end = arr.length - 1;
        for (int i = 0; i <= end; i++) {
            for (int j = 1; j <= end - i; j++) {
                // compare adjacent values
                if (arr[j] < arr[j - 1]) {
                    // swap
                    swap(arr, j - 1, j);
                    swapped = true;
                }
            }

            // do not increment the i pointer if the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // code for swap
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}