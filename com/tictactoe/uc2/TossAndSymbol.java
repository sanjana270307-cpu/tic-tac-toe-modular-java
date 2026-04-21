package com.tictactoe.uc2;

import java.util.Random;

public class TossAndSymbol {

    public static void main(String[] args) {

        char userSymbol;
        char computerSymbol;
        char currentPlayer;

        Random random = new Random();
        int toss = random.nextInt(2);

        if (toss == 0) {
            System.out.println("User won the toss!");
            userSymbol = 'X';
            computerSymbol = 'O';
            currentPlayer = userSymbol;
        } else {
            System.out.println("Computer won the toss!");
            computerSymbol = 'X';
            userSymbol = 'O';
            currentPlayer = computerSymbol;
        }

        System.out.println("User Symbol: " + userSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
        System.out.println("First Turn: " + currentPlayer);
    }
}