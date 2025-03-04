import java.util.Scanner;

public class Prime {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = s.nextInt();
        s.close();

        boolean isPrime = true;

        if (x <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime== true) {
            System.out.println(x+" is a prime number.");
        } else {
            System.out.println(x+" is not a prime number.");
        }
    }
}
