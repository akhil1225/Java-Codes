class B{
A obj;
B(A obj){
this.obj=obj;
}
void display(){
System.out.println(obj.data);//using data mem
}
}
class A{
int data=10;
A(){
B b=new B(this);
b.display();
}
public static void main(String args[]){
new A();
int a=5,b=6;
System.out.println(a!=b);
}
}
