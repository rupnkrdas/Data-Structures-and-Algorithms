// Q: Search for -7 in the range of index [1, 4]

package com.rupankar;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = { 18, 12, -7, 3, 14, 28 };
        int target = -7;
        System.out.println(linearSearch(nums, target, 1, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index < end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }

        return -1;
    }

}
