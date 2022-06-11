// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
package com.rupankar.questions;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 555, 901, 482, -3224 };
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int noOfNumbersWithEvenNoOfDigits = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] *= -1;
            }
            if (findNoOfDigits(nums[i]) % 2 == 0) {
                noOfNumbersWithEvenNoOfDigits++;
            }
        }

        return noOfNumbersWithEvenNoOfDigits;
    }

    // find the number of digits in the number
    static int findNoOfDigits(int num) {
        int noOfDigits = 0;
        while (num > 0) {
            num = num / 10;
            noOfDigits++;
        }

        return noOfDigits;
    }

    // OR we can use a shortcut to find the number of digits in a number
    static int findNumberOfDigits2(int num) {
        // return the integer value of Math.log10(num) + 1
        return (int) (Math.log10(num)) + 1;
    }

}