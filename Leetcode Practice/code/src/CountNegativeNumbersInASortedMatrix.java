// Q: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 4, 3, 2, -1 },
                { 3, 2, 1, -1 },
                { 1, 1, -1, -2 },
                { -1, -1, -2, -3 },
        };
        System.out.println(countNegatives(arr));
    }

    static int countNegatives(int[][] grid) {
        int count = 0;
        for (int row = 0; row <= grid.length - 1; row++) {
            // applying binary search
            int start = 0;
            int end = grid[row].length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (grid[row][mid] >= 0) {
                    start = mid + 1;
                } else {
                    count += (end - mid + 1);
                    end = mid - 1;
                }
            }
        }

        return count;
    }
}
