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

    public int rollDice() {
        int diceRoll = 0;
        for (int i = 0; i < diceCount; i++) {
            diceRoll += random.nextInt(endNumber - startNumber + 1) + startNumber;
        }
        return diceRoll;
    }
}
