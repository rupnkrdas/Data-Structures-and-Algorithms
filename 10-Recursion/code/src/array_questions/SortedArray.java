package array_questions;

// Check if the array is sorted or not "recursively"
public class SortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4 };
        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] arr) {
        return helper(arr, 0);
    }

    static boolean helper(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }

        return ((arr[i] < arr[i + 1]) && helper(arr, i + 1));
    }
}
