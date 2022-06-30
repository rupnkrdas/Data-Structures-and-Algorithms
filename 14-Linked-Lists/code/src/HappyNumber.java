/*
 * https://leetcode.com/problems/happy-number/
 * Google
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(digitSquareSum(fast));
        } while (fast != slow);

        if (slow == 1) {
            return true;
        }

        return false;
    }

    private int digitSquareSum(int num) {
        int ans = 0;

        while (num > 0) {
            int digit = num % 10;
            ans += digit * digit;
            num /= 10;
        }

        return ans;
    }
}
