package com.tictactoe.uc1;

public class DisplayBoard {

    public static void main(String[] args) {

        // Step 1: Create 3x3 board
        char[][] board = new char[3][3];

        // Step 2: Initialize board with '-'
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }

        // Step 3: Print the board
        System.out.println("Empty Tic-Tac-Toe Board:");
        printBoard(board);
    }

    // Method to print board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}