package com.tictactoe;

import com.tictactoe.uc3.UserInput;
import com.tictactoe.uc4.SlotConverter;
import com.tictactoe.uc5.MoveValidator;

public class TicTacToeApp {

    public static void main(String[] args) {

        // Create empty board
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        int slot = UserInput.getUserSlot();

        int[] pos = SlotConverter.getRowCol(slot);
        int row = pos[0];
        int col = pos[1];

        boolean isValid = MoveValidator.isValidMove(board, row, col);

        if (isValid) {
            System.out.println("Move accepted at Row: " + row + ", Column: " + col);
        } else {
            System.out.println("Try again!");
        }
    }
}