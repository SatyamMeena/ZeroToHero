package Java.BackTracking;

public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    static int queens(boolean[][] board, int r) {
        if (board.length == r) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int i = 0; i < board[0].length; i++) {
            if (isSafe(board, r, i)) {
                board[r][i] = true;
                count = count + queens(board, r + 1);
                board[r][i] = false;
            }
        }

        return count;
    }

    static void display(boolean[][] board) {
        for (boolean[] bs : board) {
            for (boolean bs2 : bs) {
                if (bs2) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    static boolean isSafe(boolean[][] board, int r, int c) {
        for (int i = 0; i < r; i++) {
            if (board[i][c]) {
                return false;
            }
        }

        int minLeft = Math.min(r, c);
        for (int i = 1; i <= minLeft; i++) {
            if (board[r - i][c - i]) {
                return false;
            }
        }
        int minRight = Math.min(r, board[0].length - c - 1);
        for (int i = 1; i <= minRight; i++) {
            if (board[r - i][c + i]) {
                return false;
            }
        }

        return true;

    }
}
