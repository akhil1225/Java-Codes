
import java.util.Scanner;
public class StudentRes {
public static void main(String[] args) {
Scanner s= new Scanner(System.in);
System.out.print("enter your marks: ");
int m= s.nextInt();
if (m>=90){System.out.println("Congratulations! You got 1st rank");} 
else if(m>=75){ System.out.println("You got 2nd rank");}
else if(m>=50) { System.out.println("You got 3rd rank");}
else if(m>=35) {System.out.println("You just passed");}
else if(m>=10){System.out.println("You failed");}
else{ System.out.println("Invalid credentials. Please enter valid marks.");} s.close();
}
}