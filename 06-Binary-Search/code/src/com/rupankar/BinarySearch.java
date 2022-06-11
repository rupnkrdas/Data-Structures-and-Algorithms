package com.rupankar;

public class BinarySearch {
    public static void main(String[] args) {
        // sorted array
        int[] arr = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
        System.out.println(binarySearch(arr, 55));
    }

    // return the index
    // return -1 if the target doesnt exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }

        // target not found
        return -1;
    }
}