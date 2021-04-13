package boardgame;

/**
 * @author luisf on 09/04/2021
 */
public class Board {

    private int rows;
    private int columns;
    private int mines;
    private Cell[][] cells;

    public Board(int rows, int columns, int mines) {
        this.rows = rows;
        this.columns = columns;
        this.mines = mines;
    }
}
