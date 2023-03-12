package questions.ticTacToe.entity;


public class Board {
    Character[][] cells;

    public Board() {
        this.cells = new Character[3][3];
    }

    public Character[][] getCells() {
        return cells;
    }
}
