package com.tictactoe.uc4;

public class SlotConverter {

    public static int[] getRowCol(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        return new int[]{row, col};
    }
}