package com.rupankar; // package in simple terms is a folder in which my java file lies

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hey how are you"); // print the string in the standard output stream
        Scanner input = new Scanner(System.in); // creating an input variable of type Scanner
        System.out.println(input.nextInt());
    }
}
