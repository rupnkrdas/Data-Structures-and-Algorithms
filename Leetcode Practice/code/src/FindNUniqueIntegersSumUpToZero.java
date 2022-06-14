import java.util.Arrays;

public class FindNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
    }

    static int[] sumZero(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n - 1; i += 2) {
            result[i] = i + 1;
            result[i + 1] = -(i + 1);
        }
        return result;
    }
}
