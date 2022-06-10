// Q: https://leetcode.com/problems/find-the-highest-altitude/

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = { -4, -3, -2, -1, 4, 3, 2 };
        System.out.println(maxAltitude(gain));
    }

    static int maxAltitude(int[] arr) {
        int max = 0;
        int sum = 0;
        for (int gain : arr) {
            sum += gain;
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
