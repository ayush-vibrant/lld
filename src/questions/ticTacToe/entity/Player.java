package questions.ticTacToe.entity;

public class Player {
    String playerId;
    Symbol symbol;

    public Player(String playerId, Symbol symbol) {
        this.playerId = playerId;
        this.symbol = symbol;
    }

    public String getPlayerId() {
        return playerId;
    }

    public Symbol getSymbol() {
        return symbol;
    }
}
