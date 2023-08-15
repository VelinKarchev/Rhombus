package Rhombus;

public class Matrix {

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
            int i = k;
            int j = 0;
            while (i >= 0) {
                if (k == matrix.length / 2 - 1) {
                    matrix[i][j] = "/";
                } else {
                    matrix[i][j] = ".";
                }
                i--;
                j++;
            }
        }

        for (int k = 1; k <= matrix.length / 2 - 1; k++) {
            int i = matrix.length / 2 - 1;
            int j = k;
            while (j <= matrix.length / 2 - 1) {

                if (isEmptySpace) {
                    matrix[i][j] = " ";
                } else {
                    matrix[i][j] = "/";
                }
                i--;
                j++;
            }
            isEmptySpace = !isEmptySpace;
        }
    }

    private static void mirrorUpperRightQuadrant(String[][] matrix) {
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length / 2; i++) {
                matrix[i][matrix.length - 1 - j] = matrix[i][j];
                if (matrix[i][j].equals("/")) {
                    matrix[i][j] = matrix[i][j].replace('/', '\\');
                }
            }
        }
    }

    private static void mirrorBottomHalfOfTheMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[matrix.length - 1 - i][j] = matrix[i][j];

                if (matrix[i][j].equals("/")) {

                    matrix[i][j] = matrix[i][j].replace('/', '\\');

                } else if (matrix[i][j].equals("\\")) {

                    matrix[i][j] = matrix[i][j].replace('\\', '/');
                }
            }
        }

    }
}
