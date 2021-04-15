package boardgame;

/**
 * @author luisf on 09/04/2021
 */
public class Board {

    private int rows;
    private int columns;
    private Cell[][] cells;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.cells = new Cell[rows][columns];
    }

    public Cell getCell(int row, int column) {
        return cells[row][column];
    }

    public Cell getCell(Position position) {
        return cells[position.getRow()][position.getColumn()];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void createEmptyCells() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                cells[i][j] = new Cell(this, new Position(i, j));
            }
        }
    }

    public void revealCell(Position position) {
        cells[position.getRow()][position.getColumn()].reveal();
    }
}
