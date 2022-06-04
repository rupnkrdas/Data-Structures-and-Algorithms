package com.rupankar;

// Q: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Asked in Google
import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 1 };
        System.out.println(findDisappearedNumbers(arr));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        // applying cyclic sort
        int i = 0;
        while (i <= nums.length - 1) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index <= nums.length - 1; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
