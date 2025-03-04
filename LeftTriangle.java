import java.util.Scanner;

public class LeftTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no.of rows for the pyramid: ");
        int rows = s.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = rows; j > i + 1; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
