import java.util.Scanner;
public class Divisible{
    public static void main(String... args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int r=s.nextInt();
        System.out.print("Enter the number for dividing: ");
        int d=s.nextInt();
        for(int i=0;i<=r;i++){
            if(i%d==0){
                System.out.print(i+" ");
            }
        }
    }
}