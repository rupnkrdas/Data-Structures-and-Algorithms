package com.rupankar;

// Q: https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 1 }; // a mountain array
        int target = 3;
        int ans = orderAgnosticBinarySearch(arr, target, 0, peakIndex(arr));
        if (ans == -1) {
            ans = orderAgnosticBinarySearch(arr, target, peakIndex(arr), arr.length - 1);
        }
        System.out.println(ans);
    }

    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // we are in descending part of the array
                end = mid;
            } else {
                // we are in ascending part of the array
                start = mid + 1;
            }
        }

        return start;
    }

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {

        boolean isAscending;
        if (arr[end] > arr[start]) {
            isAscending = true;
        } else {
            isAscending = false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isAscending) {
                if (target == arr[mid]) {
                    return mid;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target == arr[mid]) {
                    return mid;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
