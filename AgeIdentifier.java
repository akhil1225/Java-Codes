import java.util.Scanner;

public class AgeIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int numPeople = scanner.nextInt();
        
        int[] ages = new int[numPeople];

        System.out.println("Enter the age of each person: ");
        for (int i = 0; i < numPeople; i++) {
            ages[i] = scanner.nextInt();
        }

        int maxAge = Integer.MIN_VALUE;
        int minAge = Integer.MAX_VALUE;
        

        for (int i = 0; i < numPeople; i++) {
            if (ages[i] > maxAge) {
                maxAge = ages[i];
           
            }
            if (ages[i] < minAge) {
                minAge = ages[i];
              
            }
        }

        System.out.println("Maximum age: " + maxAge );
        System.out.println("Minimum age: " + minAge );
        
        scanner.close();
    }
}
