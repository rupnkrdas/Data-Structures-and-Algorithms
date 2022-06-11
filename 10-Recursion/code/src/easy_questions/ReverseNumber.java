package easy_questions;

public class ReverseNumber {
    static int sum = 0;

    static void reverse1(int num) {
        if (num == 0) {
            return;
        }

        int lastDigit = num % 10;
        sum = sum * 10 + lastDigit;
        reverse1(num / 10);
    }

    static int reverse2(int num) {
        int noOfDigits = (int) (Math.log10(num)) + 1;
        return helper(num, noOfDigits);
    }

    static int helper(int num, int noOfDigits) {
        if (num % 10 == num) {
            return num;
        }
        int lastDigit = num % 10;

        return lastDigit * (int) (Math.pow(10, noOfDigits - 1)) + helper(num / 10, noOfDigits - 1);
    }

    public static void main(String[] args) {
        System.out.println(reverse2(1342));
    }

}
