package boardgame;

/**
 * @author luisf on 09/04/2021
 */
public class Cell {

    private boolean isVisible;
    private boolean isBomb;

    public Cell(boolean isBomb) {
        this.isVisible = false;
        this.isBomb = isBomb;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setBomb(boolean bomb) {
        isBomb = bomb;
    }

    public boolean isBomb() {
        return isBomb;
    }

    public void revealCell() {
        this.isVisible = true;
    }
}
