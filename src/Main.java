import java.util.Scanner;

public class Main {


    /*
    By given dimensions print the pattern consisting of many embedded rhombs represented with
    “/” and “\” and separated by space and “.” for the rest of the pattern. The pattern looks like:
Input
The input data should be read from the console.
You have an integer number N (always even number) showing the width and the height of the most outer rhomb.
The width and the height will always be equal number of symbols on the terminal.
The input data will always be valid and in the format described. There is no need to check it explicitly.
Output
The output should be printed on the console.
Use the “/” and “\” characters to print the rhomb sides and “.” (Dot) for the rest.
You should print exactly one space between each rhomb. See the examples below.
Constraints
N will always be a positive even number between 6 and 80 inclusive.

     */
/*
          6

        ../\..
        ./  \.
        / /\ \
        \ \/ /
        .\  /.
        ..\/..

          8

        .../\...
        ../  \..
        ./ /\ \.
        / /  \ \
        \ \  / /
        .\ \/ /.
        ..\  /..
        ...\/...

        12

        ...../\.....
        ..../  \....
        .../ /\ \...
        ../ /  \ \..
        ./ / /\ \ \.
        / / /  \ \ \
        \ \ \  / / /
        .\ \ \/ / /.
        ..\ \  / /..
        ...\ \/ /...
        ....\  /....
        .....\/.....

 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int outerRhombSize = readInput(scanner);

        printUpperHalfRhombus(outerRhombSize);
        printBottomHalfRhombus(outerRhombSize);
    }


    public static int readInput(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }

    private static void printUpperHalfRhombus(int outerRhombSize) {
        int halfSize = outerRhombSize / 2;
        for (int i = 0; i < halfSize; i++) {
            //dots
            for (int j = 0; j < halfSize; j++) {

                    System.out.print(".");
            }
            System.out.println();
        }
    }
    private static void printBottomHalfRhombus(int outerRhombSize) {
        int halfSize = outerRhombSize / 2;
        for (int i = halfSize; i > 0; i--) {
            for (int j = outerRhombSize; j > 0; j--) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
