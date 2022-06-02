package com.rupankar;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);
        // trim is used to remove the extra spaces
        // in.next will get the next the word and applying charAt(0) will give the
        // character at the 0th index of the word

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase!");
        } else {
            System.out.println("Uppercase!");
        }

        in.close();
    }
}