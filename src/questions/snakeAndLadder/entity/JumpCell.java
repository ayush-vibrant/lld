package questions.snakeAndLadder.entity;

public class JumpCell extends Cell {
    private int start;
    private int end;

    public JumpCell(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public int getDestination() {
        return end;
    }
}
