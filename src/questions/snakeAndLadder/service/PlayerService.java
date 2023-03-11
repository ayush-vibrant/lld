package questions.snakeAndLadder.service;

import questions.snakeAndLadder.entity.Player;

import java.util.List;

public class PlayerService {
    private List<Player> players;
    private final int numberOfPlayers;

    public PlayerService(int numberOfPlayers, List<Player> players) {
        this.numberOfPlayers = numberOfPlayers;
        this.players = players;
    }

    public void addPlayers() {
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player(i, 0));
        }
    }

    public Player getCurrentPlayer(int currentPlayerIndex) {
        return players.get(currentPlayerIndex);
    }
}