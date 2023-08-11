import java.util.Scanner;

public class MainWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int outerRhombSize = readInput(scanner);

        Character[][] matrix = new Character[outerRhombSize][outerRhombSize];
        fillTheMatrixWithDots(matrix);

        fillUpperHalfRhombus(matrix);
        fillBottomHalfRhombus(matrix);
        fillDots(matrix);
        printMatrix(matrix);

    }


    public static int readInput(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }

    public static void fillTheMatrixWithDots(Character[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = ' ';
            }
        }

    }

    public static void printMatrix(Character[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void fillUpperHalfRhombus(Character[][] matrix) {
        int index = 0;
        int halfSize = matrix.length / 2;


        for (int i = 0; i < halfSize; i++) {
            for (int j = 0; j < halfSize - i; j++) {
                matrix[i][j] = '.';

            }
            for (int j = halfSize + index; j < matrix.length; j++) {
                matrix[i][j] = '.';
            }


            for (int j = 0; j < matrix.length; j++) {
                if (index % 2 == 0) {
                    matrix[i][(matrix.length / 2) - 1] = '/';
                    matrix[i][(matrix.length / 2)] = '\\';

                    matrix[i][(matrix.length / 2) - 1 - i] = '/';
                    matrix[i][(matrix.length / 2) + i] = '\\';


                } else if (index % 2 != 0) {
                    matrix[i][(matrix.length / 2) - 1 - i] = '/';
                    matrix[i][(matrix.length / 2) + i] = '\\';
                }


            }
            index++;

            
        }
        
    }

    private static void fillBottomHalfRhombus(Character[][] matrix) {

        int halfSize = (matrix.length / 2);
        int index = halfSize;
        int decrease = halfSize -1;
        for (int i = halfSize; i > 0; i--) {

            for (int j = 0; j < halfSize - i + 1; j++) {
                matrix[index][j] = '.';
            }

            for (int j = halfSize + decrease; j < matrix.length; j++) {
                matrix[index][j] = '.';
            }


            for (int j = matrix.length; j > 0; j--) {
                if (index == matrix.length - 1 || index % 2 != 0) {
                    matrix[matrix.length - i][(matrix.length / 2) - 1] = '\\';
                    matrix[matrix.length - i][(matrix.length / 2)] = '/';
                    matrix[matrix.length - i][(matrix.length / 2) - 1 + i] = '/';
                    matrix[matrix.length - i][(matrix.length / 2) - i] = '\\';

                } else if (index % 2 == 0) {
                    matrix[matrix.length - i][(matrix.length / 2) - 1 + i] = '/';
                    matrix[matrix.length - i][(matrix.length / 2) - i] = '\\';

                    matrix[matrix.length - i][(matrix.length / 2) - 1 + i] = '/';
                    matrix[matrix.length - i][(matrix.length / 2) - i] = '\\';


                }


            }
            index++;
            decrease--;
        }
    }
    
    public static void fillDots(Character[][] matrix){

        for (int i = 0; i < 1; i++) {
            
        }
        
    }
}
