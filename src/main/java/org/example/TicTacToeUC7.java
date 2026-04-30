import java.util.Random;
public class TicTacToeUC7 {

    public static int[] getRowCol(int slot) {
        int index = slot - 1;
        int row = index / 3;
        int col = index % 3;
        return new int[]{row, col};
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
        System.out.println("\nBoard State:\n");
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
            int slot = rand.nextInt(9) + 1; // 1–9

            int[] pos = getRowCol(slot);
            int row = pos[0];
            int col = pos[1];

            if (isValidMove(board, row, col)) {
                placeMove(board, row, col, symbol);
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("UC7: Computer Random Move (Easy Level)\n");

        // Sample board
        char[][] board = {
                {'X', '-', 'O'},
                {'-', 'X', '-'},
                {'-', '-', '-'}
        };

        char computerSymbol = 'O';

        computerMove(board, computerSymbol);

        printBoard(board);
    }
}