package com.tictactoe;

import com.tictactoe.uc3.UserInput;
import com.tictactoe.uc4.SlotConverter;

public class TicTacToeApp {

    public static void main(String[] args) {

        int slot = UserInput.getUserSlot();

        int[] position = SlotConverter.getRowCol(slot);

        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }
}