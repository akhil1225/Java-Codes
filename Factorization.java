import java.util.Scanner;
public class Factorization {
    public static void factor(int x){
        for(int i=1; i<=x;i++){
            if(x%i==0){
                System.out.print(i+" ");
            
            }
        }
    }
    public static void main(String... args){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter number: ");
        int x= s.nextInt();
        factor(x);
    }
}

