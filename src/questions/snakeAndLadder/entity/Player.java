package questions.snakeAndLadder.entity;

public class Player {
    private final int playerId;
    private int position;

    public Player(int playerId, int position) {
        this.playerId = playerId;
        this.position = position;
    }

    public int getPlayerId() {
        return playerId;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
