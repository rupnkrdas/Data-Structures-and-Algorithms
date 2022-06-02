package com.rupankar;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();

        int revNum = 0;

        while (num > 0) {
            int rem = num % 10;
            revNum = revNum * 10 + rem;
            num /= 10;
        }

        System.out.println("The reversed number is: " + revNum);

        in.close();
    }
}