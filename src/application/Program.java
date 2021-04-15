package application;

import boardgame.Position;
import minesweeper.MineMatch;

import java.util.Scanner;

/**
 * @author luisf on 14/04/2021
 */
public class Program {

    public static void main(String[] args) {

        MineMatch match = new MineMatch(10, 10);
        Scanner sc = new Scanner(System.in);

        while (true) {
            UI.clearScreen();
            UI.printMatch(match);

            System.out.println();
            System.out.print("ROW: ");
            int row = sc.nextInt();

            System.out.print("COLUMN: ");
            int column = sc.nextInt();

            match.hitCell(new Position(row - 1, column - 1));

            UI.clearScreen();
            UI.printMatch(match);
        }
    }
}
