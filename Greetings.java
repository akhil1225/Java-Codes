public class Greetings {
    String name;
    public Greetings(String name) {
        this.name=name;
    }
    public void sayHello(){

        System.out.println("Hello, "+name+" welcome to CodeTantra");}
        public static void main(String[] args){
            Greetings person1 = new Greetings(args[0]); 
            Greetings person2 = new Greetings(args[1]);
            person1.sayHello(); 
            person2.sayHello();
}
}