package com.rupankar;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }

        // StringBuilder doesn't create new objects everytime, it's making changes to
        // the previous StringBuilder only just like an array
        // StringBuilder is mutable just like arrays
        System.out.println(builder);

    }
}
