package Rhombus;

public class RhombusPatternImplementedInMatrix {

    public static void fillMatrix(String[][] matrix) {

        //top left quadrant
        fillTopLeftQuadrant(matrix);

        //top right quadrant -> mirrored top left quadrant with replaced '/' with '\\'
        mirrorUpperRightQuadrant(matrix);

        // bottom half -> mirrored upper half with replaced '/' with '\\'
        mirrorBottomHalfOfTheMatrix(matrix);

    }

    private static void fillTopLeftQuadrant(String[][] matrix) {
        int rows = matrix.length / 2;
        boolean isEmptySpace = true;

        for (int k = 0; k <= rows - 1; k++) {
            int row = k;
            int col = 0;

            while (row >= 0) {
                if (k == matrix.length / 2 - 1) {
                    matrix[row][col] = "/";
                } else {
                    matrix[row][col] = ".";
                }
                row--;
                col++;
            }
        }

        for (int k = 1; k <= matrix.length / 2 - 1; k++) {
            int row = matrix.length / 2 - 1;
            int col = k;

            while (col <= matrix.length / 2 - 1) {

                if (isEmptySpace) {
                    matrix[row][col] = " ";
                } else {
                    matrix[row][col] = "/";
                }
                row--;
                col++;
            }
            isEmptySpace = !isEmptySpace;
        }
    }

    private static void mirrorUpperRightQuadrant(String[][] matrix) {
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length / 2; row++) {
                matrix[row][matrix.length - 1 - col] = matrix[row][col];

                if (matrix[row][col].equals("/")) {
                    matrix[row][col] = matrix[row][col].replace('/', '\\');
                }
            }
        }
    }

    private static void mirrorBottomHalfOfTheMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[matrix.length - 1 - row][col] = matrix[row][col];

                if (matrix[row][col].equals("/")) {

                    matrix[row][col] = matrix[row][col].replace('/', '\\');

                } else if (matrix[row][col].equals("\\")) {

                    matrix[row][col] = matrix[row][col].replace('\\', '/');
                }
            }
        }
    }
}
