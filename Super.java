class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        super.draw();  // Invokes the draw method from the superclass
        System.out.println("Drawing a circle");
    }
}
public class Super{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}
