import java.util.Scanner;
public class Largest_3 {
    public static void main(String... args){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter 1st number: ");
    int x= s.nextInt();

    System.out.print("Enter 2nd number: ");
    int y= s.nextInt();

    System.out.print("Enter 3rd number: ");
    int z= s.nextInt();

    if (x>=y && x>=z){
        System.out.println("The largest number is: "+x);
    } else if (y>=x && y>=z){
        System.out.println("The largest number is: "+y);
    } else {
        System.out.println("The largest number is: "+z);
    }
    s.close();
}}