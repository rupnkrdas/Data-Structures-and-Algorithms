package com.rupankar;

// Q: https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 3, 1 };
        int target = 1;
        int ans = 0;

        int pivot = findPivot(arr);
        System.out.println("pivot of the array: " + findPivot(arr));

        if (pivot == -1) {
            // pivot not found, it means the array is monotonic array
            // use order agnostic binary search
            ans = binarySearch(arr, target, 0, arr.length - 1);
        } else {
            // pivot is found
            ans = binarySearch(arr, target, 0, pivot);

            if (ans == -1) {
                ans = binarySearch(arr, target, pivot + 1, arr.length - 1);
            }
        }

        System.out.println("index of the target: " + ans);

    }

    // return index of the pivot
    // pivot refers to the index of the largest element in the array
    // that means there will be a pivot even if the array is sorted in descending
    // order
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // return -1 if the pivot is not found
    }

    static int binarySearch(int[] arr, int target, int index1, int index2) {
        int start = index1;
        int end = index2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // target not found
        return -1;
    }
}
