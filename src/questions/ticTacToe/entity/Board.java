package questions.ticTacToe.entity;


public class Board {
    Symbol[][] cells;

    public Board() {
        this.cells = new Symbol[3][3];
    }

    public Symbol[][] getCells() {
        return cells;
    }
}
