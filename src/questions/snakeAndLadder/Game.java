package questions.snakeAndLadder;

import questions.snakeAndLadder.entity.*;
import questions.snakeAndLadder.service.BoardService;
import questions.snakeAndLadder.service.DiceService;
import questions.snakeAndLadder.service.PlayerService;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final int numberOfPlayers;
    private final List<Player> players;
    private int currentPlayerIndex;
    private final Board board;
    private final Dice dice;
    private final PlayerService playerService;
    private final BoardService boardService;
    private final DiceService diceService;

    public Game(int numberOfPlayers, Board board, Dice dice) {
        this.numberOfPlayers = numberOfPlayers;
        this.board = board;
        this.dice = dice;
        this.currentPlayerIndex = 0;
        this.players = new ArrayList<>(numberOfPlayers);

        // Important to do it this way. (Constructor injection)
        this.playerService = new PlayerService(numberOfPlayers, players);
        this.boardService = new BoardService(this.board);
        this.diceService = new DiceService(this.dice);
    }

    public void startGame() {
        boardService.createBoard();
        playerService.addPlayers();
        Player currentPlayer = playerService.getCurrentPlayer(currentPlayerIndex);
        while (true) {
            System.out.println("Player " + currentPlayer.getPlayerId() + " is at position " + currentPlayer.getPosition());

            int diceRoll = diceService.rollDice();

            System.out.println("Player " + currentPlayer.getPlayerId() + " rolls a dice and gets " + diceRoll);

            int possibleNewPosition = currentPlayer.getPosition() + diceRoll;

            if (possibleNewPosition > board.getSize()) {
                System.out.println("Player " + currentPlayer.getPlayerId() + " wins the game");
                break;
            }

            int newPosition = boardService.getNewPosition(currentPlayer, possibleNewPosition);
            currentPlayer.setPosition(newPosition);

            System.out.println("Now player " + currentPlayer.getPlayerId() + " is at position " + newPosition + "\n");

            nextPlayer();
            currentPlayer = playerService.getCurrentPlayer(currentPlayerIndex);
        }
    }

    private void nextPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % numberOfPlayers;
    }
}
