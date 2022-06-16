
// Q: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
import java.util.Arrays;

public class TwoSumII_InputArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = { -3, 3, 4, 90 };
        int target = 0;
        System.out.println(Arrays.toString(binarySearch(arr, target)));
    }

    static int[] binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[start] + arr[mid] > target) {
                end = mid - 1;
            } else {
                if (arr[start] + arr[end] == target) {
                    return new int[] { start + 1, end + 1 };
                } else if (arr[start] + arr[end] > target) {
                    end--;
                } else {
                    start++;
                }

            }
        }

        return new int[] { -1, -1 };
    }
}