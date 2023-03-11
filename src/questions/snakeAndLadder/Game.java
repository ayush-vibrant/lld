package questions.snakeAndLadder;

import questions.snakeAndLadder.entity.*;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final int numberOfPlayers;
    private final List<Player> players;
    private int currentPlayerIndex;
    private final Board board;
    private final Dice dice;

    public Game(int numberOfPlayers, Board board, Dice dice) {
        this.numberOfPlayers = numberOfPlayers;
        this.board = board;
        this.players = new ArrayList<>(numberOfPlayers);
        this.currentPlayerIndex = 0;
        this.dice = dice;
    }

    private void addPlayers() {
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player(i, 0));
        }
    }

    public void startGame() {
        board.createBoard();
        addPlayers(); // could be called at client via a PlayerService class
        Player currentPlayer = getCurrentPlayer();
        while (true) {
            System.out.println("Player " + currentPlayer.getPlayerId() + " is at position " + currentPlayer.getPosition());
            int diceRoll = dice.rollDice();
            System.out.println("Player " + currentPlayer.getPlayerId() + " rolls a dice and gets " + diceRoll);
            int possibleNewPosition = currentPlayer.getPosition() + diceRoll;
            if (possibleNewPosition > board.getSize()) {
                System.out.println("Player " + currentPlayer.getPlayerId() + " wins the game");
                break;
            }

            int newPosition = getNewPosition(currentPlayer, possibleNewPosition, board);
            currentPlayer.setPosition(newPosition);
            System.out.println("Now player " + currentPlayer.getPlayerId() + " is at position " + newPosition);
            System.out.println();

            nextPlayer();
            currentPlayer = getCurrentPlayer();
        }
    }

    // should be moved to a different class
    private static int getNewPosition(Player currentPlayer, int possibleNewPosition, Board board) {
        Cell cell = board.getCellAt(possibleNewPosition);
        int newPosition = possibleNewPosition;
        if (cell instanceof JumpCell) {
            JumpCell jumpCell = (JumpCell) cell;
            printSnakeOrLadder(currentPlayer, jumpCell);
            newPosition = jumpCell.getDestination();
            if (board.getCellAt(newPosition) instanceof JumpCell) {
                getNewPosition(currentPlayer, newPosition, board);
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

    private Player getCurrentPlayer() {
        return players.get(currentPlayerIndex);
    }

    private void nextPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % numberOfPlayers;
    }

}
