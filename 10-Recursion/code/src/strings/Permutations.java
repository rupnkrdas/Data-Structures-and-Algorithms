package strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        // permutations("", str);
        // System.out.println(permutationsArrayList("", str));
        System.out.println(permutationsCount("", str));
    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            // total number of empty spaces = length + 1

            String left = p.substring(0, i);
            String right = p.substring(i, p.length());
            permutations(left + ch + right, up.substring(1));
        }
    }

    static ArrayList<String> permutationsArrayList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            // total number of empty spaces = length + 1

            String left = (p.substring(0, i));
            String right = p.substring(i, p.length());
            ans.addAll(permutationsArrayList(left + ch + right, up.substring(1)));
        }

        return ans;
    }

    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            // total number of empty spaces = length + 1

            String left = p.substring(0, i);
            String right = p.substring(i, p.length());

            count = count + permutationsCount(left + ch + right, up.substring(1));
        }

        return count;
    }
}
