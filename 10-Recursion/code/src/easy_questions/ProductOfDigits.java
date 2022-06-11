package easy_questions;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(prodOfDigits(2342));
    }

    static int prodOfDigits(int num) {
        if (num % 10 == num) {
            return num;
        }

        int lastDigit = num % 10;
        return (lastDigit) * prodOfDigits(num / 10);
    }
}
