import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();

        int length = 2 * radius;
        int centerX = radius;
        int centerY = radius;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int distanceX = Math.abs(j - centerX);
                int distanceY = Math.abs(i - centerY);
                double distance = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));

                if (distance <= radius) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
