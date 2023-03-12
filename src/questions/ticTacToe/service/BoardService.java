package questions.ticTacToe.service;

import java.util.Objects;
import questions.ticTacToe.entity.Board;

public class BoardService {
    Board board;

    public BoardService(Board board) {
        this.board = board;
    }

    public void addSymbol(Character symbol, int row, int column) {
        board.getCells()[row][column] = symbol;
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board.getCells()[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean isGameOver(int lastRow, int lastColumn, Character symbol) {
        return isRowComplete(lastRow, symbol) ||
                isColumnComplete(lastColumn, symbol) ||
                isDiagonalComplete(symbol);
    }

    private boolean isDiagonalComplete(Character symbol) {
        return (Objects.equals(board.getCells()[0][0], symbol) &&
                Objects.equals(board.getCells()[1][1], symbol) &&
                Objects.equals(board.getCells()[2][2], symbol)) ||
                (Objects.equals(board.getCells()[0][2], symbol) &&
                        Objects.equals(board.getCells()[1][1], symbol) &&
                        Objects.equals(board.getCells()[2][0], symbol));
    }

    private boolean isColumnComplete(int lastColumn, Character symbol) {
        return Objects.equals(board.getCells()[0][lastColumn], symbol) &&
                Objects.equals(board.getCells()[1][lastColumn], symbol) &&
                Objects.equals(board.getCells()[2][lastColumn], symbol);
    }

    private boolean isRowComplete(int lastRow, Character symbol) {
        return Objects.equals(board.getCells()[lastRow][0], symbol) &&
                Objects.equals(board.getCells()[lastRow][1], symbol) &&
                Objects.equals(board.getCells()[lastRow][2], symbol);
    }

    public boolean isTie() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.getCells()[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }
}
