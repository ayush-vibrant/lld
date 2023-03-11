package questions.snakeAndLadder.entity;

import java.util.Random;

public class SnakeLadderAdder {
    private final Board board;
    private final Random random;

    public SnakeLadderAdder(Board board) {
        this.board = board;
        this.random = new Random();
    }

    void addLadders() {
        while (board.getRemainingLadderCount() > 0) {
            int start = random.nextInt(board.getSize() - 1) + 1;
            int end = random.nextInt(board.getSize() - start) + start + 1;
            if (board.getBoard().get(start) instanceof NormalCell && board.getBoard().get(end) instanceof NormalCell) {
                board.getBoard().put(start, new JumpCell(start, end));
                board.setRemainingLadderCount(board.getRemainingLadderCount() - 1);
            }
        }
    }

    void addSnakes() {
        while (board.getRemainingSnakeCount() > 0) {
            int start = random.nextInt(board.getSize() - 1) + 1;
            int end = random.nextInt(start - 1) + 1;
            if (board.getBoard().get(start) instanceof NormalCell && board.getBoard().get(end) instanceof NormalCell) {
                board.getBoard().put(start, new JumpCell(start, end));
                board.setRemainingSnakeCount(board.getRemainingSnakeCount() - 1);
            }
        }
    }
}