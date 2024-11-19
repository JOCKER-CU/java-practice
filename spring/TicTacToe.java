import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;
    private boolean gameOver;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        gameOver = false;
        initializeBoard();
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's play Tic Tac Toe!");

        while (!gameOver) {
            printBoard();
            System.out.print("Player " + currentPlayer + ", enter your move (row [1-3] and column [1-3]): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                makeMove(row, col);
                if (hasPlayerWon(currentPlayer)) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins! Game over.");
                    gameOver = true;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw! Game over.");
                    gameOver = true;
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move! Please try again.");
            }
        }

        scanner.close();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private boolean isValidMove(int row, int col) {
        return row >= 1 && row <= 3 && col >= 1 && col <= 3 && board[row - 1][col - 1] == '-';
    }

    private void makeMove(int row, int col) {
        board[row - 1][col - 1] = currentPlayer;
    }

    private boolean hasPlayerWon(char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playGame();
    }
}
