class Person {
    private String name;
    private int age;

    // Constructor Person with 2 arguments
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private int studentId;

    // Constructor Student with 3 arguments, calling superclass constructor using super
    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    // Method to display student information, calling displayDetails() inside
    public void displayStudentInfo() {
        super.displayDetails(); // Call superclass method
        System.out.println("Student ID: " + studentId);
    }
}

public class University {
    public static void main(String[] args) {
        // Receive 3 arguments from args[0], args[1], args[2] and assign to respective variables
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        int studentId = Integer.parseInt(args[2]);

        // Create a Student object and display student information
        Student student = new Student(name, age, studentId);
        System.out.println("Student Information:");
        student.displayStudentInfo();
    }
}
