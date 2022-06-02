package com.rupankar;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 12 }
        };
        /*
         * OR
         * int[][] arr = new int[][] {
         * { 23, 4, 1 },
         * { 18, 12, 3, 9 },
         * { 78, 99, 34, 56 },
         * { 18, 12 }
         * }
         */
        int target = 34;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    // return index of the target if present in the 2D array, otherwise return -1,
    // -1
    static int[] search(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[] { -1, -1 };
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col }; // we cant write return new {row, col} becuz the array hasnt been
                                                   // declared yet, So first we need to declare and then initialize the
                                                   // array
                    // always first declare and then initialize the array
                    // we need to declare the object before initializing it
                }
            }
        }

        return new int[] { -1, -1 };
    }
}
