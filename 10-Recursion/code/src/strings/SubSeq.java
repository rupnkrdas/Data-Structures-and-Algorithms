package strings;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        String str = "abc";
        // subseq("", str);
        // System.out.println(subseqArrayList("", str));
        subseqAscii("", str);
    }

    // here "p" refers to the processed string
    // "up" refers to the unprocessed string
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            // System.out.print(Arrays.toString(p.toCharArray()) + " "); // to say in array
            // form p.toCharArray()
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseqArrayList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseqArrayList(p + ch, up.substring(1));
        ArrayList<String> right = subseqArrayList(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    // return the ascii value as well
    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            // System.out.print(Arrays.toString(p.toCharArray()) + " "); // to say in array
            // form p.toCharArray()
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);
        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch + 0), up.substring(1));

    }
}
