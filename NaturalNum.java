import java.util.Scanner;
public class NaturalNum{

     public static void main(String... args){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x= s.nextInt();

        int result =sumOfN(x);

        if (x<=0){
            System.out.println("Enter a value greater than 0");
        }else {
            System.out.println("The sum of first "+x+" numbers is: "+result);
        }
        s.close();
    }
    public static int sumOfN(int x){
        if(x<=0){
          System.out.println("Enter a positive integer");
          return x;
        } else{
          return x+sumOfN(x-1);
        }
        

    }
   
}


