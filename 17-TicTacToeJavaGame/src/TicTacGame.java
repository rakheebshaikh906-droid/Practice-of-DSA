import java.util.Scanner;

public class TicTacGame {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        // initialize board with spaces
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);

            System.out.print("Player " + player + " enter row and column (0-2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid position! Try again.");
                continue;
            }

            if (board[row][col] == ' ') {
                board[row][col] = player;

                gameOver = haveWon(board, player);
                if (gameOver) {
                    printBoard(board);
                    System.out.println("Player " + player + " has won!");
                } else if (isBoardFull(board)) {
                    printBoard(board);
                    System.out.println("Game Draw!");
                    break;
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Cell already occupied! Try again.");
            }
        }

        scanner.close();
    }

    // Print the board
    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int row = 0; row < board.length; row++) {
            System.out.print("| ");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

        // Check win condition
    public static boolean haveWon(char[][] board, char player) {
        // rows
            for (int row = 0; row < 3; row++) {
                if (board[row][0] == player &&
                        board[row][1] == player &&
                        board[row][2] == player) {
                    return true;
                }
            }

            // columns
            for (int col = 0; col < 3; col++) {
                if (board[0][col] == player &&
                        board[1][col] == player &&
                        board[2][col] == player) {
                    return true;
                }
            }

            // diagonals
            if (board[0][0] == player &&
                    board[1][1] == player &&
                    board[2][2] == player) {
                return true;
            }

            if (board[0][2] == player &&
                    board[1][1] == player &&
                    board[2][0] == player) {
                return true;
            }

            return false;
        }

        // Check if board is full
        public static boolean isBoardFull(char[][] board) {
            for (int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[row].length; col++) {
                    if (board[row][col] == ' ') {
                        return false;
                    }
                }
            }
            return true;
        }
    }

