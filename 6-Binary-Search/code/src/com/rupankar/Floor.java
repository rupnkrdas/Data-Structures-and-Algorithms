package com.rupankar;

public class Floor {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };

        int target = -1;
        System.out.println(floor(arr, target));
    }

    static int floor(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // if there are no numbers less than the target element
        if (target < arr[0]) {
            return -1;
        }

        // implementing binary search
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return arr[end];
    }

}
