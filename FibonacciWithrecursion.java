import java.util.Scanner;
public class FibonacciWithrecursion{
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        } else{
            return fibonacci(n-2)+fibonacci(n-1);
        }
    }
    public static void main(String... args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter range for fibonacci: ");
        int r= s.nextInt();
        System.out.println("Fibonacci upto "+r+" : ");
        for(int i=0;i<r;i++){
            System.out.print(fibonacci(i)+" ");
        }
        s.close();
    }
}