
// Q: https://leetcode.com/problems/two-sum/
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 4 };
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && (nums[i] + nums[j] == target)) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };
    }

}
