package com.rupankar;

// Q: https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class RotationCount {
    public static void main(String[] args) {
        int[] arr = { 3, 1 };

        int count = 0;
        int pivot = findPivot(arr);
        if (pivot == -1) {
            // pivot is not found, implies that the array is not rotated
            count = 0;
        } else {
            // the array is rotated and the pivot is found
            count = pivot + 1;
        }

        System.out.println(count);

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
}
