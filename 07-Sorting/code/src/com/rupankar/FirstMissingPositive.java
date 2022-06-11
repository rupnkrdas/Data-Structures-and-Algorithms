package com.rupankar;

// Q: https://leetcode.com/problems/first-missing-positive/
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0 };
        System.out.println(cyclicSort(arr));
    }

    static int cyclicSort(int[] arr) {
        int i = 0;
        while (i <= arr.length - 1) {
            int correctIndex = arr[i] - 1;
            if (arr[i] >= 1 && arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // the array is now cyclic sorted
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        return arr.length + 1;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
