package questions.snakeAndLadder.entity;


import java.util.Random;

public class Dice {
    private final int diceCount;
    private final int startNumber = 1;
    private final int endNumber = 6;
    private final Random random = new Random();

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int getDiceCount() {
        return diceCount;
    }

    public int getStartNumber() {
        return startNumber;
    }

    public int getEndNumber() {
        return endNumber;
    }

    public Random getRandom() {
        return random;
    }
}
