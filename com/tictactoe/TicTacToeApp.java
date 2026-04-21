package com.tictactoe;

import com.tictactoe.uc3.UserInput;

public class TicTacToeApp {

    public static void main(String[] args) {
        int slot = UserInput.getUserSlot();
        System.out.println("You selected: " + slot);
    }
}