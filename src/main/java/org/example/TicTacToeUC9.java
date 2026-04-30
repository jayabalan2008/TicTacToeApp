public class TicTacToeUC9 {
    public static boolean checkWin(char[][] board, char symbol) {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol &&
                    board[i][1] == symbol &&
                    board[i][2] == symbol) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (board[0][j] == symbol &&
                    board[1][j] == symbol &&
                    board[2][j] == symbol) {
                return true;
            }
        }

        if ((board[0][0] == symbol &&
                board[1][1] == symbol &&
                board[2][2] == symbol) ||

                (board[0][2] == symbol &&
                        board[1][1] == symbol &&
                        board[2][0] == symbol)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("UC9: Check Winning Condition\n");

        char[][] board = {
                {'X', 'X', 'X'},
                {'-', 'O', '-'},
                {'O', '-', 'O'}
        };

        char playerSymbol = 'X';

        boolean win = checkWin(board, playerSymbol);

        if (win) {
            System.out.println("Player with symbol '" + playerSymbol + "' wins!");
        } else {
            System.out.println("No winner yet.");
        }
    }
}