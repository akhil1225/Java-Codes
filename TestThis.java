class Student {
    int i = 10;

    void display() {
        int i = 20;
        System.out.println(i);
    }
}

public class TestThis {
    public static void main(String... args) {
        Student s1 = new Student(); // Create an instance of the Student class
        s1.display(); // Call the display method on the instance
    }
}