package Try3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n / 2; i++) {

            for (int k = n / 2 - 1; k >= i; k--) {
                System.out.print(".");
            }


            for (int j = 1; j < i * 2; j++) {

                if (i == 1 && j < (n/2)) {
                    System.out.print("/\\");
                } else {

                    if (j < (n / 2 - 2)) {
                        System.out.print("/ ");
                    } else {
                        System.out.print("\\ ");
                    }
                }

            }
            System.out.println();
        }
    }
}
