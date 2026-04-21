package com.tictactoe.uc5;

public class MoveValidator {

    public static boolean isValidMove(char[][] board, int row, int col) {

        // Check boundaries
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid move! Out of bounds.");
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            System.out.println("Invalid move! Cell already occupied.");
            return false;
        }

        return true;
    }
}