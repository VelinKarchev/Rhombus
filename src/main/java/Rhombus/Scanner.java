package Rhombus;

public class Scanner {


    public static java.util.Scanner startScanner(){
        return new java.util.Scanner(System.in);
    }
    public static int readInput(java.util.Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }

    public static void closeScanner(java.util.Scanner scanner){
        scanner.close();
    }
}
