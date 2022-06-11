package array_questions;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3 };
        int target = 2;
        System.out.println(binarySearch(arr, target, 0, arr.length - 1));
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        }
        if (target == arr[mid]) {
            return mid;
        }

        if (arr[mid] >= arr[start]) {
            if (target >= arr[start] && target < arr[mid]) {
                return binarySearch(arr, target, start, mid - 1);
            } else {
                return binarySearch(arr, target, mid + 1, end);
            }
        } else {
            if (target <= arr[end] && target > arr[mid]) {
                return binarySearch(arr, target, mid + 1, end);
            } else {
                return binarySearch(arr, target, start, mid - 1);
            }
        }

    }
}
