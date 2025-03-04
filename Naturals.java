import java.util.Scanner;
public class Naturals{
    public static void main(String... args){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the range: ");
        int x= s.nextInt();
        
        for (int i=1;i<=x;i++){
            System.out.print(i+" ");
        }
        s.close();
    }
}