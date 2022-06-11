// Q: https://leetcode.com/problems/find-smallest-letter-greater-than-target/

package com.rupankar;

public class SmallestLetterGreaterThan {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        char target = 'j';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] arr, char target) {
        // implement binary search because the question is very much similar to the
        // ceiling question
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        /*
         * since the array wraps around, we can return arr[start%arr.length] in order to
         * return the first index(because it wont make a difference when start <
         * arr.length)
         */
        return arr[start % arr.length];
    }
}
