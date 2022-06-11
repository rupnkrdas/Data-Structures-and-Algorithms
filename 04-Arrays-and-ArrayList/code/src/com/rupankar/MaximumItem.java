package com.rupankar;

/**
 * MaximumItem
 */
public class MaximumItem {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 9, 18 };
        System.out.println(max(arr));
    }

    // imagine that the arr is not empty
    static int max(int[] arr) {
        int maxValue = arr[0];

        for (int index = 1; index < arr.length; index++) {
            if (maxValue < arr[index]) {
                maxValue = arr[index];
            }
        }

        return maxValue;
    }
}