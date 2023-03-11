package questions.snakeAndLadder.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Board {
    private final int size;
    private final SnakeLadderAdder snakeLadderAdder = new SnakeLadderAdder(this);

    // snakeCount and ladderCount should be final,
    // but if they are final then they cannot be changed in the addSnakes and addLadders methods.
    // hence to solve that, we are adding two new variables to keep track of the remaining ladders and snakes
    private int remainingSnakeCount;
    private int remainingLadderCount;
    private final int snakeCount;
    private final int ladderCount;
    private Map<Integer, Cell> board;



    public Board(int size, int snakeCount, int ladderCount) {
        this.size = size;
        this.snakeCount = snakeCount;
        this.remainingSnakeCount = snakeCount;
        this.ladderCount = ladderCount;
        this.remainingLadderCount = ladderCount;
        this.board = new HashMap<>();
    }

    public Map<Integer, Cell> createBoard() {
        initializeBoard();
        snakeLadderAdder.addSnakes();
        snakeLadderAdder.addLadders();
        return board;
    }

    private void addLadders() {
        snakeLadderAdder.addLadders();
    }

    private void addSnakes() {
        snakeLadderAdder.addSnakes();
    }

    private void initializeBoard() {
        for (int i = 1; i <= size; i++) {
            board.put(i, new NormalCell(i));
        }
    }

    public int getSize() {
        return size;
    }

    public Map<Integer, Cell> getBoard() {
        return board;
    }

    public int getRemainingSnakeCount() {
        return remainingSnakeCount;
    }

    public void setRemainingSnakeCount(int remainingSnakeCount) {
        this.remainingSnakeCount = remainingSnakeCount;
    }

    public int getRemainingLadderCount() {
        return remainingLadderCount;
    }

    public void setRemainingLadderCount(int remainingLadderCount) {
        this.remainingLadderCount = remainingLadderCount;
    }

    /**
     * Encapsulation: The Board class should encapsulate the internal workings of the board,
     * meaning that its internal state should not be directly accessible from other classes.
     * Instead of returning the board map directly in the createBoard and getBoard methods,
     * you can create methods to access specific cells, like getCellAt(int position).
     */
    public Cell getCellAt(int position) {
        return board.get(position);
    }
}
