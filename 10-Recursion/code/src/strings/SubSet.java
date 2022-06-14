package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3 };
        // System.out.println(subset(arr));
        int[] arr = { 1, 2, 2 };
        System.out.println(subsetWithDuplicates(arr));
    }

    // time complexity = O(n * 2ⁿ), here 2ⁿ represents total number of subsets
    // space complexity = O(2ⁿ * n), 2ⁿ --> total subsets, O(n) --> space taken by
    // each subset
    static List<List<Integer>> subset(int[] arr) {
        ArrayList<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }

        return outer;

    }

    static List<List<Integer>> subsetWithDuplicates(int[] arr) {
        Arrays.sort(arr);
        // it will sort the original array

        ArrayList<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;

            // if current and previous element is same, start = end + 1;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;

            for (int j = start; j <= end; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }

        }

        return outer;

    }

}
