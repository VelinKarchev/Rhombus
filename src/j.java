import java.util.Scanner;

public class j {






            public static void generateRhombusPattern(int size) {
                int middle = size / 2;

                for (int i = 0; i < middle; i++) {
                    String spacesBefore = ".".repeat(middle - i);
                    String spacesBetween = ".".repeat(2 * i);
                    System.out.print(spacesBefore + "/");
                    if (i != 0) {
                        System.out.print(spacesBetween + "\\");
                    }
                    System.out.println(spacesBefore);
                }

                for (int i = middle - 1; i >= 0; i--) {
                    String spacesBefore = ".".repeat(middle - i);
                    String spacesBetween = ".".repeat(2 * i);
                    System.out.print(spacesBefore + "\\");
                    if (i != 0) {
                        System.out.print(spacesBetween + "/");
                    }
                    System.out.println(spacesBefore);
                }
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the width and height of the rhombus (even number between 6 and 80): ");
                int N = scanner.nextInt();

                if (N < 6 || N > 80 || N % 2 != 0) {
                    System.out.println("Invalid input. Please enter an even number between 6 and 80.");
                } else {
                    generateRhombusPattern(N);
                }
            }
        }


