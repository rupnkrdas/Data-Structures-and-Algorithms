package backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        // System.out.println(countPathsPossible(3, 3));
        // printPaths("", 3, 3);
        // System.out.println();
        // System.out.println(printPathsReturn("", 3, 3));
        // System.out.println(printPathsWithDiagonalsReturn("", 3, 3));

        boolean[][] board = {
                { true, true, true },
                { true, false, true },
                { true, true, true },
        };
        printPathsWithRestrictions("", board, 0, 0);

    }

    // returns total number of possible paths from (r, c) to (0, 0)
    static int countPathsPossible(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = countPathsPossible(r - 1, c);
        int right = countPathsPossible(r, c - 1);

        return left + right;
    }

    // prints the possible paths from (r, c) to (0, 0)
    static void printPaths(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.print(p + " ");
            return;
        }

        if (r > 1) {
            printPaths(p + 'D', r - 1, c);
        }
        if (c > 1) {
            printPaths(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> printPathsReturn(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (r > 1) {
            ans.addAll((printPathsReturn(p + 'D', r - 1, c)));
        }
        if (c > 1) {
            ans.addAll(printPathsReturn(p + 'R', r, c - 1));
        }

        return ans;
    }

    static ArrayList<String> printPathsWithDiagonalsReturn(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (r > 1) {
            ans.addAll((printPathsWithDiagonalsReturn(p + 'V', r - 1, c)));
        }
        if (c > 1) {
            ans.addAll(printPathsWithDiagonalsReturn(p + 'H', r, c - 1));
        }
        // if going diagonal
        if (r > 1 && c > 1) {
            ans.addAll(printPathsWithDiagonalsReturn(p + "D", r - 1, c - 1));
        }

        return ans;
    }

    static void printPathsWithRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.print(p + " ");
            return;
        }

        if (maze[r][c] == false) {
            return;
        }

        if (r < maze.length - 1) {
            printPathsWithRestrictions(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            printPathsWithRestrictions(p + 'R', maze, r, c + 1);
        }
    }
}
