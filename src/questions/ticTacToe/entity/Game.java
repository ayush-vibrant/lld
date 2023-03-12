package questions.ticTacToe.entity;

import java.util.List;

public class Game {
    Board board;
    List<Player> playerList;
    int currentPlayerIndex;

    public Game(Board board, List<Player> playerList) {
        this.board = board;
        this.playerList = playerList;
        this.currentPlayerIndex = 0;
    }

    public Board getBoard() {
        return board;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public int getCurrentPlayerIndex() {
        return currentPlayerIndex;
    }

    public void setCurrentPlayerIndex(int currentPlayerIndex) {
        this.currentPlayerIndex = currentPlayerIndex;
    }
}
