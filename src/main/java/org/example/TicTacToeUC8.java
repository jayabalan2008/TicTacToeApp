import java.util.Random;
import java.util.Scanner;

public class TicTacToeUC8 {
    public static int[] getRowCol(int slot) {
        int index = slot - 1;
        return new int[]{index / 3, index % 3};
    }

    public static boolean isValidMove(char[][] board, int row, int col) {
        return (row >= 0 && row < 3 &&
                col >= 0 && col < 3 &&
                board[row][col] == '-');
    }

    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public static void printBoard(char[][] board) {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void computerMove(char[][] board, char symbol) {
        Random rand = new Random();

        while (true) {
            int slot = rand.nextInt(9) + 1;
            int[] pos = getRowCol(slot);

            if (isValidMove(board, pos[0], pos[1])) {
                placeMove(board, pos[0], pos[1], symbol);
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }

    public static boolean checkWin(char[][] b, char s) {
        for (int i = 0; i < 3; i++) {
            if ((b[i][0] == s && b[i][1] == s && b[i][2] == s) ||
                    (b[0][i] == s && b[1][i] == s && b[2][i] == s)) {
                return true;
            }
        }
        return (b[0][0] == s && b[1][1] == s && b[2][2] == s) ||
                (b[0][2] == s && b[1][1] == s && b[2][0] == s);
    }

    public static boolean isDraw(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("UC8: Continuous Turn-Based Game Loop\n");

        Scanner sc = new Scanner(System.in);

        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        char playerSymbol = 'X';
        char computerSymbol = 'O';
        boolean playerTurn = true;

        while (true) {

            printBoard(board);

            if (playerTurn) {
                // Player move
                System.out.print("\nEnter slot (1-9): ");
                int slot = sc.nextInt();

                int[] pos = getRowCol(slot);

                if (isValidMove(board, pos[0], pos[1])) {
                    placeMove(board, pos[0], pos[1], playerSymbol);
                } else {
                    System.out.println("Invalid move! Try again.");
                    continue; // retry same turn
                }

                if (checkWin(board, playerSymbol)) {
                    printBoard(board);
                    System.out.println("\nPlayer Wins!");
                    break;
                }

            } else {
                computerMove(board, computerSymbol);

                if (checkWin(board, computerSymbol)) {
                    printBoard(board);
                    System.out.println("\nComputer Wins!");
                    break;
                }
            }

            if (isDraw(board)) {
                printBoard(board);
                System.out.println("\nGame is a Draw!");
                break;
            }

            playerTurn = !playerTurn;
        }
    }
}