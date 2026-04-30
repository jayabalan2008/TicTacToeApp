import java.util.Scanner;
public class TicTacToeUC10 {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        initializeBoard();
        displayBoard();

        System.out.println("Checking draw status: " + isDraw());
    }

    static void initializeBoard() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = '-';
            }
        }
    }

    static void displayBoard() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }

    static boolean isDraw() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkWin(char player) {

        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }
}