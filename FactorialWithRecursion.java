import java.util.Scanner;

public class FactorialWithRecursion {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();
        scanner.close();

        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
