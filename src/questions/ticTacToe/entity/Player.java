package questions.ticTacToe.entity;

public class Player {
    String playerId;
    Character symbol;

    public Player(String playerId, Character symbol) {
        this.playerId = playerId;
        this.symbol = symbol;
    }

    public String getPlayerId() {
        return playerId;
    }

    public Character getSymbol() {
        return symbol;
    }
}
