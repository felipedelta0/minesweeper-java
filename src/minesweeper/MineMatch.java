package minesweeper;

import boardgame.Board;
import boardgame.Cell;
import boardgame.Position;

/**
 * @author luisf on 14/04/2021
 */
public class MineMatch {

    private Board board;

    public MineMatch(int rows, int columns) {
        this.board = new Board(rows, columns);
        this.board.createEmptyCells();
    }

    public Cell[][] getCells() {
        Cell[][] cells = new Cell[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                cells[i][j] = board.getCell(i, j);
            }
        }
        return cells;
    }

    public void hitCell(Position targetPosition) {
        this.board.revealCell(targetPosition);
    }
}
