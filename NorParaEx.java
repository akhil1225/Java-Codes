public class NorParaEx {
    String name;
    int id;
    int age;
    NorParaEx(String x, int y, int z){
        name=x;
        id=y;
        age=z;
    }
    NorParaEx(){
        name="Akhil";
        id=493;
        age=19;
    }
    void display(){
        System.out.println(name+" "+id+" "+age);
    }
    public static void main(String... args){
        NorParaEx c1 = new NorParaEx("A",4,29);
        NorParaEx c2= new NorParaEx();
        c1.display();
        c2.display();
    }
}
