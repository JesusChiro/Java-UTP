package Semana03;

import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
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

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkForWin() {
        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
    }

    private boolean checkRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonalsForWin() {
        return (checkRowCol(board[0][0], board[1][1], board[2][2]) || checkRowCol(board[0][2], board[1][1], board[2][0]));
    }

    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }

    public void changePlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public boolean placeMarker(int row, int col) {
        if ((row >= 0 && row < 3) && (col >= 0 && col < 3) && (board[row][col] == '-')) {
            board[row][col] = currentPlayer;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        boolean gameWon = false;

        System.out.println("Tic Tac Toe - ¡Comienza el juego!");

        while (!game.isBoardFull() && !gameWon) {
            game.printBoard();
            System.out.println("Jugador " + game.currentPlayer + ", es tu turno.");
            System.out.println("Ingresa la fila (0-2): ");
            int row = scanner.nextInt();
            System.out.println("Ingresa la columna (0-2): ");
            int col = scanner.nextInt();

            if (game.placeMarker(row, col)) {
                if (game.checkForWin()) {
                    gameWon = true;
                    System.out.println("¡Felicidades! Jugador " + game.currentPlayer + " ha ganado.");
                } else {
                    game.changePlayer();
                }
            } else {
                System.out.println("La posición seleccionada no es válida. Intenta de nuevo.");
            }
        }

        if (!gameWon) {
            System.out.println("¡Empate! El juego ha terminado en un empate.");
        }
        game.printBoard();
        scanner.close();
    }
}
