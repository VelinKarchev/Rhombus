import java.util.Scanner;

public class Hollol {
    public static void main(String[] args) {
        // take input
        Scanner scan = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter N value:: ");
        n = scan.nextInt();
        printStarHollowDiamond(n);
    }

    private static void printStarHollowDiamond(int n) {
        if(n <= 0)
            System.out.println("Enter Positive Number");

        // for first half portion (top to bottom)
        for(int i=1; i <= n+1; i++) {

            // print space
            for(int j = i; j <= n; j++) {
                System.out.print(" ");
            }

            // print digit or space
            for(int k = 1; k <= 2*i-1; k++) {
                if(k==1 || k==(2*i-1) )
                    System.out.print("?");
                else
                    System.out.print(" ");
            }

            // new line
            System.out.println();
        }

        // for second half portion
        for(int i=n; i >= 1; i--) {

            // print space
            for(int j=n; j >= i; j--) {
                System.out.print(" ");
            }

            // print digit or space
            for(int k=1; k <= 2*i-1; k++) {
                if(k==1 || k==(2*i-1) )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // new line
            System.out.println();
        }
    }

}
