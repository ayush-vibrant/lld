package questions.snakeAndLadder.service;

import questions.snakeAndLadder.entity.*;

import java.util.Map;

public class BoardService {
    private Board board;

    public BoardService(Board board) {
        this.board = board;
    }

    public Map<Integer, Cell> createBoard() {
        initializeBoard();
        SnakeLadderAdderService snakeLadderAdderService = new SnakeLadderAdderService(board);
        snakeLadderAdderService.addSnakes();
        snakeLadderAdderService.addLadders();
        return board.getBoard();
    }

    private void initializeBoard() {
        for (int i = 1; i <= board.getSize(); i++) {
            board.getBoard().put(i, new NormalCell(i));
        }
    }

    public int getNewPosition(Player currentPlayer, int possibleNewPosition) {
        Cell cell = board.getCellAt(possibleNewPosition);
        int newPosition = possibleNewPosition;
        if (cell instanceof JumpCell) {
            JumpCell jumpCell = (JumpCell) cell;
            printSnakeOrLadder(currentPlayer, jumpCell);
            newPosition = jumpCell.getDestination();
            if (board.getCellAt(newPosition) instanceof JumpCell) {
                getNewPosition(currentPlayer, newPosition);
            }
        } else if (cell instanceof NormalCell) {
            newPosition = cell.getDestination();
        }
        return newPosition;
    }

    private static void printSnakeOrLadder(Player currentPlayer, JumpCell jumpCell) {
        if (jumpCell.getEnd() > jumpCell.getStart()) {
            System.out.println("Player " + currentPlayer.getPlayerId()
                    + " climbed a ladder from " + jumpCell.getStart()
                    + " to " + jumpCell.getEnd());
        } else {
            System.out.println("Player " + currentPlayer.getPlayerId()
                    + " was bitten by a snake from " + jumpCell.getStart()
                    + " to " + jumpCell.getEnd());
        }
    }
}
