class Final{
    final int x = 50;
    public final void display(){
        System.out.print(x+" Hello World");
    }
}
class Final2 extends Final{
   public final void  displayE(){
   
    System.out.print("HAii");
   }
}
public class FinalWord{
    public static void main(String[] args) {
    Final2 y = new Final2();
    y.display();
}
    
}
