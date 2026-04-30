package org.example;

public class TicTacToeUC6 {
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Method to print board (for checking)
    public static void printBoard(char[][] board) {
        System.out.println("\nBoard State:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("UC6: Place Move on Board\n");

        // Initialize board
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        int row = 1;
        int col = 1;
        char symbol = 'X';

        placeMove(board, row, col, symbol);

        printBoard(board);
    }
}