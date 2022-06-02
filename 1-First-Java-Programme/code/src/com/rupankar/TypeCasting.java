package com.rupankar;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // explicit type casting
        int num = (int) (67.65f);
        System.out.println(num);

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte) (a);

        System.out.println(b);
    }
}