import java.util.Scanner;

public class MainWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int outerRhombSize = readInput(scanner);

        Character[][] matrix = new Character[outerRhombSize][outerRhombSize];

        createEmptyMatrix(matrix);

        fillWithDots(matrix);
        fillUpperHalf(matrix);
        fillBottomHalf(matrix);
        printMatrix(matrix);


    }


    public static int readInput(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }

    public static void createEmptyMatrix(Character[][] matrix) {

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

    private static void fillUpperHalf(Character[][] matrix) {
        int index = 0;
        int halfSize = matrix.length / 2;


        for (int i = 0; i < halfSize; i++) {



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

    private static void fillBottomHalf(Character[][] matrix) {

        int halfSize = (matrix.length / 2);
        int index = halfSize;


        for (int i = halfSize; i > 0; i--) {



            for (int j = matrix.length; j > 0; j--) {
                if (index == matrix.length - 1 || index % 2 != 0) {
                    matrix[matrix.length - i][(matrix.length / 2) - 1] = '\\';
                    matrix[matrix.length - i][(matrix.length / 2)] = '/';
                    matrix[matrix.length - i][(matrix.length / 2) - 1 + i] = '/';
                    matrix[matrix.length - i][(matrix.length / 2) - i] = '\\';

                } else if (index % 2 == 0) {
                    matrix[matrix.length - i][(matrix.length / 2) - 1 + i] = '/';
                    matrix[matrix.length - i][(matrix.length / 2) - i] = '\\';


                    if ( i != 2) {
                        matrix[matrix.length - i][(matrix.length / 2) - i + 2] = '\\';
                        matrix[matrix.length - i][(matrix.length / 2) - 3 + i] = '/';
                    }



                }


            }
            index++;

        }
    }
    
    public static void fillWithDots(Character[][] matrix){
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
            index ++;

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
