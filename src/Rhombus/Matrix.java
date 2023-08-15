package Rhombus;

public class Matrix {


    public static void fillUpperHalf(Character[][] matrix) {

        int halfRows = matrix.length / 2;
        int halfCols = 0;
        boolean isEmptySpace = true;

        //top left
        for (int i = 0; i < halfRows; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i + j == matrix.length / 2 - 1) {
                    matrix[i][j] = '/';
                }
            }


            //https://www.youtube.com/watch?v=vywvqdKpdC4

            //https://www.youtube.com/watch?v=T8ErAYobcbc
        }
        for (int k = 1; k <= matrix.length/2 - 1; k++) {
            int d = matrix.length/2 - 1;
            int f = k;
            while (f <= matrix.length/2 - 1) {
                if (isEmptySpace) {

                        matrix[d][f] = ' ';
                }else {
                    isEmptySpace = true;
                    matrix[d][f] = '/';
                }
                d--;
                f++;
            }
            isEmptySpace = !isEmptySpace;
        }


        //top right
        halfRows = matrix.length / 2;
        halfCols = matrix.length / 2;
        for (int i = 0; i < halfRows; i++) {
            for (int j = halfCols; j < matrix.length; j++) {
                if (j - i == 6) {
                    matrix[i][j] = '\\';
                }
            }
        }
    }


    public static void fillBottomHalf(Character[][] matrix) {

        int halfRows = matrix.length / 2;
        int halfCols = 0;

        // bottom left
        for (int i = halfRows; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i - j == 6) {
                    matrix[i][j] = '\\';
                }
            }
        }
        halfRows = matrix.length / 2;
        halfCols = matrix.length / 2;
        //bottom right
        for (int i = halfRows; i < matrix.length; i++) {
            for (int j = halfCols; j <= matrix.length; j++) {
                if (j + i == matrix.length + 5) {
                    matrix[i][j] = '/';
                }
            }
        }
    }

    public static void fillWithDots(Character[][] matrix) {
        int halfSize = matrix.length / 2;
        int indexDown = halfSize;
        int decrease = halfSize - 1;

        int index = 0;

        for (int i = 0; i < halfSize; i++) {
            for (int j = 0; j < halfSize - i; j++) {
                matrix[i][j] = '.';

            }
            for (int j = halfSize + index; j < matrix.length; j++) {
                matrix[i][j] = '.';
            }
            index++;

        }

        for (int k = halfSize; k > 0; k--) {

            for (int j = 0; j < halfSize - k + 1; j++) {
                matrix[indexDown][j] = '.';
            }

            for (int j = halfSize + decrease; j < matrix.length; j++) {
                matrix[indexDown][j] = '.';
            }
            indexDown++;
            decrease--;
        }
    }
}
