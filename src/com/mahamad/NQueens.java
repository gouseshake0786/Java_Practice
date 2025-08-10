package com.mahamad;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(printQueen(board, 0));
    }

    static int printQueen(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        for (int col = 0; col < board[0].length; col++) {
            if (isSafee(board, row, col)) {
                board[row][col] = true;
                count += printQueen(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    static boolean isSafee(boolean[][] board, int row, int col) {
        //vertical check
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        //Left Diagonal
        int minLeft = Math.min(row, col);
        for (int i = 1; i <= minLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        //Right Diagonal
        int minRight = Math.min(row, board.length - col
                - 1);
        for (int i = 1; i <= minRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean ele : row) {
                if (ele) {
                    System.out.print("Q ");
                } else System.out.print("X ");
            }
            System.out.println();
        }
    }
}
