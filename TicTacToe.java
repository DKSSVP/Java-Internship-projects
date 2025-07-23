import java.util.*;

public class TicTacToe {
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
    static Scanner sc = new Scanner(System.in);
    static char currentPlayer = 'X';

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game!");

        for (int moves = 0; moves < 9; moves++) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter row and column (0-2):");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                if (checkWin()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    return;
                }
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Cell already taken. Try again.");
                moves--; // retry
            }
        }

        printBoard();
        System.out.println("It's a draw!");
    }

    static void printBoard() {
        System.out.println("-------------");
        for (char[] row : board) {
            System.out.print("| ");
            for (char cell : row) {
                System.out.print(cell + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    static boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            // rows and columns
            if ((board[i][0] == currentPlayer &&
                 board[i][1] == currentPlayer &&
                 board[i][2] == currentPlayer) ||
                (board[0][i] == currentPlayer &&
                 board[1][i] == currentPlayer &&
                 board[2][i] == currentPlayer)) {
                return true;
            }
        }
        // diagonals
        return (board[0][0] == currentPlayer &&
                board[1][1] == currentPlayer &&
                board[2][2] == currentPlayer) ||
               (board[0][2] == currentPlayer &&
                board[1][1] == currentPlayer &&
                board[2][0] == currentPlayer);
    }
}
