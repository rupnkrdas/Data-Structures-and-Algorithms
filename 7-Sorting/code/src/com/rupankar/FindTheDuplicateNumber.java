package com.rupankar;

// Q: https://leetcode.com/problems/find-the-duplicate-number/
import java.util.Arrays;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 3, 4, 2 };
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length - 1]);
    }

    static void cyclicSort(int[] nums) {
        int i = 0;
        while (i <= nums.length - 1) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
