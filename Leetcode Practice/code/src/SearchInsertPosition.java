// Q: https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        System.out.println(binarySearch(arr, 5));
    }

    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return end + 1;
    }
}
