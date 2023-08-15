package Rhombus;

import java.util.Scanner;


import static Rhombus.Matrix.fillMatrix;
import static Rhombus.PrintMatrix.printMatrix;
import static Rhombus.Utils.readInput;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = readInput(scanner);

        String[][] matrix = new String[matrixSize][matrixSize];

        fillMatrix(matrix);
        printMatrix(matrix);
    }
}
