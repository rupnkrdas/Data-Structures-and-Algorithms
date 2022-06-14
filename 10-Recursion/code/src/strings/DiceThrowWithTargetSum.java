package strings;

import java.util.ArrayList;

public class DiceThrowWithTargetSum {
    public static void main(String[] args) {
        int target = 4;
        die("", target);
        System.out.println(dieReturn("", target));
        System.out.println(dieReturnFace("", 5, 7));

    }

    static void die(String p, int target) {
        if (target == 0) {
            System.out.print(p + " ");
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            die(p + i, target - i);
        }
    }

    static ArrayList<String> dieReturn(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(dieReturn(p + i, target - i));
        }

        return ans;
    }

    static ArrayList<String> dieReturnFace(String p, int target, int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            ans.addAll(dieReturnFace(p + i, target - i, face));
        }

        return ans;
    }
}
