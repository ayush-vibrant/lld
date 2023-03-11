package questions.snakeAndLadder;

import questions.snakeAndLadder.entity.Board;
import questions.snakeAndLadder.entity.Dice;

public class SnakeAndLadderApplication {
    public static void main(String[] args) {
        Board board = new Board(100, 7, 5);
        Dice dice = new Dice(1);
        Game game = new Game(2, board, dice);
        game.startGame();
    }
}
