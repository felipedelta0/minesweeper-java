package boardgame;

/**
 * @author luisf on 14/04/2021
 */
public class Cell {

    protected Position position;
    private Board board;
    private boolean isVisible;

    public Cell(Board board, Position position) {
        this.board = board;
        this.position = position;
        this.isVisible = false;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void reveal() {
        this.isVisible = true;
    }

    @Override
    public String toString() {
        return isVisible ? "-" : "0";
    }
}
