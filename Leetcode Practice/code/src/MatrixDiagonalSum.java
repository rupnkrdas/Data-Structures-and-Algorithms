public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                { 5 },

        };
        System.out.println(diagonalSum2(matrix));

    }

    static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i <= mat.length - 1; i++) {
            int end = mat[i].length - 1;
            for (int j = 0; j <= end; j++) {
                if (j == i || j == end - i) {
                    sum += mat[i][j];
                }
            }
        }

        return sum;
    }

    static int diagonalSum2(int[][] mat) {
        int sum = 0;
        int end = mat.length - 1;
        for (int i = 0; i <= end; i++) {
            sum += mat[i][i];
            if (i != end - i) {
                sum += mat[i][end - i];
            }
        }

        return sum;
    }
}
