package questions.snakeAndLadder.entity;

public class NormalCell extends Cell {

    private int position;

    public NormalCell(int position) {
        this.position = position;
    }

    @Override
    public int getDestination() {
        return position;
    }
}
