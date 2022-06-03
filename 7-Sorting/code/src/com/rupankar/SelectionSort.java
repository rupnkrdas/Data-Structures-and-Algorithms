package com.rupankar;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1, 5 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        int end = arr.length - 1;
        for (int i = 0; i <= arr.length - 1; i++) {
            // find maximum element in the remaining array and swap with correct index
            int maxIndex = findMaxIndex(arr, 0, end - i);
            // swap the max element with its actual index element
            swap(arr, maxIndex, end - i);

        }
    }

    static int findMaxIndex(int[] arr, int index1, int index2) {
        int max = index1;
        for (int i = index1 + 1; i <= index2; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
