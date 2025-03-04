import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        s.close();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int noOfDig = String.valueOf(num).length();
        
        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, noOfDig);
            temp /= 10;
        }

        return sum == num;
    
    }
}
