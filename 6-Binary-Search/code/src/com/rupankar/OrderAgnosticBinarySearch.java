package com.rupankar;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // sorted array
        int[] arr = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
        System.out.println(orderAgnosticBinarySearch(arr, 20));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending order
        boolean isAscending;
        if (arr[start] < arr[end]) {
            isAscending = true;
        } else {
            isAscending = false;
        }

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        // target not found
        return -1;
    }
}
