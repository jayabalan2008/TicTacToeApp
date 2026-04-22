package org.example;

import java.util.Random;
public class TicTacToeUC2 {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    static void tossAndAssignSymbols() {
        Random random = new Random();
        // 0 for Human, 1 for Computer
        int toss = random.nextInt(2);

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    static void displayTossResult() {
        System.out.println("--- Toss Result ---");
        if (isHumanTurn) {
            System.out.println("Human won the toss and starts first!");
        } else {
            System.out.println("Computer won the toss and starts first!");
        }
        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
        System.out.println("-------------------");
    }
}