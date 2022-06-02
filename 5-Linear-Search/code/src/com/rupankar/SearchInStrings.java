package com.rupankar;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Rupankar Das";
        char target = 's';
        System.out.println(search(name, target));

        // to see what happens if we use toCharArray()
        System.out.print("to see what happens if we use toCharArray(): ");
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(search2(name, target));
    }

    static boolean search(String str, char target) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)) {
                return true;
            }
        }

        // target not found
        return false;
    }

    static boolean search2(String str, char target) {
        // for using 'foreach' loop, we need an array
        // so we convert our String to a character array
        for (char letter : str.toCharArray()) {
            if (letter == target) {
                return true;
            }
        }

        return false;
    }
}
