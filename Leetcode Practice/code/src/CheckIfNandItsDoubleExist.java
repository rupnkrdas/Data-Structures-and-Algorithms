// Q: https://leetcode.com/problems/check-if-n-and-its-double-exist/
public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 14, 11 };
        System.out.println(checkIfExist(arr));
    }

    static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j != i && arr[j] == 2 * arr[i]) {
                    return true;
                }
            }
        }

        return false;
    }
}
