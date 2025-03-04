import java.util.Scanner;

public class AlphabetPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the central alphabet pyramid: ");
        int rows = scanner.nextInt();

        int charValue;
        int space;

        for (int i = 1; i <= rows; i++) {
            charValue = 65; // ASCII value for 'A'
            space = 1;

            for (int j = i; j < rows; j++) {
                System.out.print("  "); // Printing spaces for alignment
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                if (j < i) {
                    System.out.print((char) (charValue + j) + " "); // Print alphabets in increasing order
                } else {
                    System.out.print((char) (charValue + j - 2 * space) + " "); // Print alphabets in decreasing order
                    space++;
                }
            }
            System.out.println();
        }
    }
}
