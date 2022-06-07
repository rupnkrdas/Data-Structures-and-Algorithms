public class Patterns {
    public static void main(String[] args) {
        // pattern5(6);
        // pattern28(5);
        // pattern30(5);
        // pattern17(4);
        pattern31(4);
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalColsInRow = row > n ? (2 * n - row) : row;
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 1; row <= (2 * n - 1); row++) {
            int totalStarsInRow = row > n ? (2 * n - row) : row;
            int totalSpacesInRow = Math.abs(row - n);
            // first print the white_spaces
            for (int col = 1; col <= totalSpacesInRow; col++) {
                System.out.print(" ");
            }
            // then print the stars
            for (int col = 1; col <= totalStarsInRow; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= 5; row++) {
            int totalDigitsInRow = 2 * row - 1;
            int totalSpacesInRow = n - row;
            // first print the white_spaces
            for (int col = 1; col <= totalSpacesInRow; col++) {
                System.out.print(" ");
            }
            for (int col = totalSpacesInRow + 1; col <= totalSpacesInRow + (totalDigitsInRow); col++) {
                System.out.print((Math.abs(n - col)) + 1);
            }

            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalSpacesInRow = n - row;
            // first print the white_spaces
            for (int col = 1; col <= totalSpacesInRow; col++) {
                System.out.print(" ");
            }

            if (row <= n) {
                // print the numbers in 2 parts
                // 1st part
                for (int col = row; col >= 1; col--) {
                    System.out.print(col);
                }
                // 2nd part
                for (int col = 2; col <= row; col++) {
                    System.out.print(col);
                }
            } else {
                // if row > n
                for (int col = 1; col <= row - n; col++) {
                    System.out.print(" ");
                }
                for (int col = 2 * n - row; col >= 1; col--) {
                    System.out.print(col);
                }
                for (int col = 2; col <= 2 * n - row; col++) {
                    System.out.print(col);
                }
            }

            System.out.println();
        }
    }

    static void pattern31(int n) {
        int originalN = n;
        n = 2 * n - 1;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                System.out.print(originalN - Math.min(Math.min(row, n - row), Math.min(col, n - col)) + " ");
            }

            System.out.println();
        }
    }
}