import java.util.Scanner;

public class Employee {
    private int empid;
    private String name;
    private double salary;

    // Parameterized constructor
    public Employee(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array of objects to store employee details
        Employee[] employees = new Employee[5];

        // Accepting data for five employees
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int empid = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: $");
            double salary = scanner.nextDouble();

            // Creating employee objects and storing in the array
            employees[i] = new Employee(empid, name, salary);
        }

        // Displaying details of all employees
        System.out.println("\nEmployee Details:");
        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }
}