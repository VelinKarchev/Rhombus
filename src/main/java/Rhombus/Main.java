package Rhombus;

import java.util.Scanner;

import static Rhombus.RhombusPatternImplementedInMatrix.fillMatrix;
import static Rhombus.PrintMatrix.printMatrix;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        scanner.close();

        Pattern pattern = new Pattern(inputNumber);

        fillMatrix(pattern.getMatrix());
        printMatrix(pattern.getMatrix());
    }
}
