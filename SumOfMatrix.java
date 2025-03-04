import java.util.Scanner;

public class SumOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a 3x3 matrix
        int[][] matrix = new int[3][3];

        // Input elements from the user
        System.out.println("Enter the elements of the 3x3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of elements
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += matrix[i][j];
            }
        }

        // Display the matrix
        System.out.println("\nThe entered matrix is:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Display the sum of elements
        System.out.println("\nThe sum of elements in the matrix is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
