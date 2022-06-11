// Q: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package com.rupankar;

import java.util.Arrays;

public class FirstAndLastElementPositionInSortedArray {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 6;
        int[] ans = { firstOcurrence(nums, target), lastOcurrence(nums, target) };
        System.out.println(Arrays.toString(ans));
    }

    /**
     * applying binary search twice:
     * once to find the first occurence {search towards the left if target is found}
     * and then to find the last occurence {search towards the right if the target
     * is found}
     */

    // return the index of first occurence
    static int firstOcurrence(int[] nums, int target) {
        int firstOccurence = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                firstOccurence = mid;
                end = mid - 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return firstOccurence;
    }

    // return the index of last occurence
    static int lastOcurrence(int[] nums, int target) {
        int lastOcurrence = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                lastOcurrence = mid;
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return lastOcurrence;
    }
}
