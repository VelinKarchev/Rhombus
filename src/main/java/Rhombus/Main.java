package Rhombus;

import static Rhombus.RhombusImplementedInMatrix.fillMatrix;
import static Rhombus.PrintMatrix.printMatrix;
import static Rhombus.ScannerImpl.*;

public class Main {

    public static void main(String[] args) {

        int matrixSize = readInput(startScanner());
        closeScanner(startScanner());

        String[][] matrix = new String[matrixSize][matrixSize];

        fillMatrix(matrix);
        printMatrix(matrix);
    }
}
