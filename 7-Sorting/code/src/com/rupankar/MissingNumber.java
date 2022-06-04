package com.rupankar;

// Q: https://leetcode.com/problems/missing-number/
// Amazon Question
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        cyclicSort(arr);
        System.out.println(linearSearch(arr));

    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i <= arr.length - 1) {
            int correctIndex = arr[i];
            if (arr[i] <= arr.length - 1 && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static int linearSearch(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] != i) {
                return i;
            }
        }

        // the last number is not present in the given array
        return arr.length;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
