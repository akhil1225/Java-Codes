import java.util.Scanner;

public class FactorialWithoutRecursion {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
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
