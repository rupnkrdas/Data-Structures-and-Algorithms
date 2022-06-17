// Q: https://leetcode.com/problems/valid-perfect-square/
public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(729));
    }

    static boolean isPerfectSquare(int n) {
        long s = 0;
        long e = n;

        while (s <= e) {
            long m = s + (e - s) / 2;

            if (m * m == n) {
                return true;
            } else if (n < m * m) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        return false;
    }
}