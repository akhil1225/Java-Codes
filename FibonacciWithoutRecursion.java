import java.util.Scanner;

public class FibonacciWithoutRecursion {
    public static void generateFibonacci(int n) {
        int num1 = 0, num2 = 1, sum;
        System.out.print("Fibonacci Series up to " + n + " terms: " + num1 + " " + num2 + " ");
        for (int i = 3; i <= n; i++) {
            sum = num1 + num2;
            System.out.print(sum + " ");
            
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int number = scanner.nextInt();
        scanner.close();

        generateFibonacci(number);
    }
}
