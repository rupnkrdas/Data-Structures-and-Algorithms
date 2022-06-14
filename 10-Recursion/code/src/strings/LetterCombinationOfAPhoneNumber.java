package strings;

import java.util.ArrayList;

public class LetterCombinationOfAPhoneNumber {
    public static void main(String[] args) {
        String str = "12";
        // combinations("", str);
        System.out.println(combinationsInArrayList("", str));
    }

    static void combinations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p + " ");
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            combinations(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> combinationsInArrayList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(combinationsInArrayList(p + ch, up.substring(1)));
        }

        return ans;
    }
}
