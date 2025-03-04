class A{
    public A(){}
    public void print(){
        System.out.print("Helo");
    }
}
class B extends A{
    public B(){}
    public void print(){
        super.print();
        System.out.print("World");
    }
}
public class Inheritence{
    public static void main(String... args){
        A x = new A();
        x.print();
    }
}