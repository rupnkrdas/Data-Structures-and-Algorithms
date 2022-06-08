// Q: https://leetcode.com/problems/arranging-coins/
public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(binarySearch(5));
    }

    static int binarySearch(int n) {
        long start = 0, end = n;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sum = mid * (mid + 1) / 2;
            if (sum == n) {
                return (int) mid;
            } else if (n < sum) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // 'n' cannot be broken down into exact arrangement of coins
        // return 1 less than the exact solution
        return (int) end;
    }
}
