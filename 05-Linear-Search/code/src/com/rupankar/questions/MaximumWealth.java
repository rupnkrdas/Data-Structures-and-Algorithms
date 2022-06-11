//https://leetcode.com/problems/richest-customer-wealth/ 
package com.rupankar.questions;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                { 2, 8, 7 },
                { 7, 1, 3 },
                { 1, 9, 5 },
        };

        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int person = 0; person < accounts.length; person++) {
            int total = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                total += accounts[person][account];
            }
            if (total > max) {
                max = total;
            }
        }

        return max;
    }
}
