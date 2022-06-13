package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1, 5 };
        selectionSort(arr, 0, 1);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr, int i, int j) {
        if (i == arr.length) {
            return;
        }
        if (j == arr.length) {
            selectionSort(arr, i + 1, i + 2);
        } else {
            if (arr[j] < arr[i]) {
                swap(arr, i, j);
            }
            selectionSort(arr, i, j + 1);
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

}
