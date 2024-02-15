
import java.util.Scanner;

public class L6Q2 {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);

        System.out.print("Enter integer n:");
        int n = g.nextInt();

        System.out.print("Enter a character c:");
        char c = g.next().charAt(0);

        for (int h = 1; h <= n/2; h++) {
            for (int j = n - h; j > 0; j--) {
                System.out.print(" ");
            }

            multiPrint(h, c);

            System.out.println(); // Move to the next line after printing characters
        }

        for (int h = n/2 - 1; h >= 1; h--) {
            for (int j = n - h; j > 0; j--) {
                System.out.print(" ");
            }

            multiPrint(h, c);

            System.out.println(); // Move to the next line after printing characters
        }
        
        System.out.println("");
        for (int h = 1; h <= n/2; h++) {
            for (int j = n - h; j > 0; j--) {
                System.out.print(" ");
            }

            multiPrint(h, c);

            System.out.println(); // Move to the next line after printing characters
        }
        
    }

    public static void multiPrint(int n, char c) {
        for (int i = 1; i <= 2 * n - 1; i += 1) {
            System.out.print(c);
        }
    }
}
