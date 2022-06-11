package com.rupankar;

import java.util.Arrays;

// whenever its given, numbers ranging from 1 - N, use cyclic sort
// time complexity of cyclic sort: O(n)
// space complexity of cyclic sort: O(1)
// better time complexity than bubble, selection and insertion sort
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i <= arr.length - 1) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
