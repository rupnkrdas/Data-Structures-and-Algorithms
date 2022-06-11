package easy_questions;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1342));
    }

    static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }

        int lastDigit = num % 10;
        return (lastDigit) + sumOfDigits(num / 10);
    }
}
