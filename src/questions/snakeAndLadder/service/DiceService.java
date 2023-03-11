package questions.snakeAndLadder.service;

import questions.snakeAndLadder.entity.Dice;

public class DiceService {
    private final Dice dice;

    public DiceService(Dice dice) {
        this.dice = dice;
    }

    public int rollDice() {
        int diceRoll = 0;
        for (int i = 0; i < dice.getDiceCount(); i++) {
            diceRoll += dice.getRandom().nextInt(dice.getEndNumber() - dice.getStartNumber() + 1) + dice.getStartNumber();
        }
        return diceRoll;
    }
}