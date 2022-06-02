package com.rupankar;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 },
        };

        System.out.println(Arrays.toString(search(matrix, 25)));
    }

    // code for binary search
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int cMid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][cMid] == target) {
                return new int[] { row, cMid };
            } else if (target < matrix[row][cMid]) {
                cEnd = cMid - 1;
            } else {
                cStart = cMid + 1;
            }
        }

        return new int[] { -1, -1 };
    }

    // static int[] binarySearchInColumn(int[][] matrix, int col, int rStart, int
    // rEnd, int target) {
    // while (rStart <= rEnd) {
    // int cMid = rStart + (rEnd-rStart)/2;

    // if (matrix[col][cMid] == target) {
    // return new int[] {col, cMid};
    // } else if (target < matrix[col][cMid]) {
    // rEnd = cMid-1;
    // } else {
    // rStart = cMid+1;
    // }
    // }

    // return new int[] {-1, -1};
    // }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // !caution!: the matrix might be empty
        if (cols == 0) {
            return new int[] { -1, -1 };
        }
        // if only one row is present
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) {// if the condition is true, we have more than 2 rows
            int rMid = rStart + (rEnd - rStart) / 2;

            if (target == matrix[rMid][cMid]) {
                return new int[] { rMid, cMid };
            } else if (target < matrix[rMid][cMid]) {
                rEnd = rMid;
            } else {
                rStart = rMid;
            }
        }

        // after the while loop is over, we have 2 rows
        // check whether the element is present in the middle column
        // 2 elements are present in the given column
        if (target == matrix[rStart][cMid]) {
            return new int[] { rStart, rEnd };
        } else if (target == matrix[rStart + 1][cMid]) {
            return new int[] { rStart + 1, cMid };
        }

        // if the target is still not found
        // try searching in the remaining 4 halves

        if (target >= matrix[rStart][0] && target <= matrix[rStart][cMid - 1]) {// searching in the first half
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        if (target <= matrix[rStart][cols - 1] && target >= matrix[rStart][cMid + 1]) { // searching in the 2nd half
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        if (target >= matrix[rStart + 1][0] && target <= matrix[rStart + 1][cMid - 1]) { // searching in the 3rd half
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }

    }
}
