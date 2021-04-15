package application;

import boardgame.Cell;
import minesweeper.MineMatch;

/**
 * @author luisf on 14/04/2021
 */
public class UI {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void printMatch(MineMatch match) {
        printBoard(match.getCells());
    }

    public static void printBoard(Cell[][] cells) {
        for (Cell[] cell : cells) {
            for (Cell value : cell) {
                printCell(value);
            }
            System.out.println();
        }
    }

    private static void printCell(Cell cell) {
        System.out.print(cell + " ");
    }
}
