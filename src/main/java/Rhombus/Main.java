package Rhombus;

import static Rhombus.RhombusImplementedInMatrix.fillMatrix;
import static Rhombus.PrintMatrix.printMatrix;
import static Rhombus.ScannerImpl.*;

public class Main {
    public static void main(String[] args) {

        Pattern pattern = new Pattern(readInput(scanner()));
        closeScanner(scanner());

        fillMatrix(pattern.getMatrix());
        printMatrix(pattern.getMatrix());
    }
}
