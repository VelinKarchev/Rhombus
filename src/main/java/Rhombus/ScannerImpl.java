package Rhombus;

import java.util.Scanner;

public class ScannerImpl {


    public static Scanner startScanner(){
        return new Scanner(System.in);
    }
    public static int readInput(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }

    public static void closeScanner(Scanner scanner){
        scanner.close();
    }
}
