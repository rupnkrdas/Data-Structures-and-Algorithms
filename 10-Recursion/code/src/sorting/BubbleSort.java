package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr) {
        return helper(arr, 0, 1);
    }

    static int[] helper(int[] arr, int i, int j) {
        if (i == arr.length) {
            return arr;
        }
        if (j <= arr.length - 1 - i) {
            if (arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
            }
            helper(arr, i, j + 1);
        }

        return helper(arr, i + 1, 1);
    }

    static void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
