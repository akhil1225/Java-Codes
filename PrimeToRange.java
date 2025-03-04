import java.util.Scanner;
public class PrimeToRange{
    public static void main(String... args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter range: ");
        int x= s.nextInt();
        for(int i=2; i<=x;i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
        }return true;
    }
}