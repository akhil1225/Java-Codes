import java.util.Scanner;
public class NaturalUptoN {
    public static void nNatural(int r){
        for(int i=110;i<=r;i++){
            System.out.print(i+" ");
        }
        
    }
    public static void main(String... args){

    
    Scanner s=new Scanner(System.in);
    System.out.print("Enter range: ");
    int r=s.nextInt();
    nNatural(r);
    }

}
