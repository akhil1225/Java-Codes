import java.util.Scanner;
public class Operators {
    public static void main(String... args){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter your age: ");
        
        int age=18;
        int akhil= s.nextInt();;
        String m= (akhil>age)?"He is eligible": "He is not eligible";
        System.out.println(m);
    }
}
