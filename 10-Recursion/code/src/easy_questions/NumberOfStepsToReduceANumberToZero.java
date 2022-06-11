package easy_questions;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(numberOfSteps(n));
    }

    static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }

        if (num % 2 == 0) {
            return helper(num / 2, steps + 1);
        } else {
            return helper(num - 1, steps + 1);
        }
    }
}
