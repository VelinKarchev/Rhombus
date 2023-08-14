package Rhombus;

import java.util.Scanner;

import static Rhombus.Matrix.fillBottomHalf;
import static Rhombus.Matrix.fillUpperHalf;
import static Rhombus.Print.printMatrix;
import static Rhombus.Utils.readInput;

public class RhombusMatrix {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int matrixSize = readInput(scanner);
        Character[][] matrix = new Character[matrixSize][matrixSize];

        fillUpperHalf(matrix);
        fillBottomHalf(matrix);
        printMatrix(matrix);
    }
}