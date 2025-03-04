class Teacher {
    // Declare variables: name and Years of Experience
    String name;
    int yoe;

    // Constructor with name parameter
    Teacher(String name) {
        this.name = name;
    }

    // Constructor with name and Years of Experience
    Teacher(String name, int yoe) {
        this.name = name;
        this.yoe = yoe;
    }

    void display() {
        System.out.println("Name: " + name + "\nYears of Experience: " + yoe);
    }
}

public class Records {
    public static void main(String[] args) {
        // if args.length is equal to 1, call the Constructor with 1 argument
        if (args.length == 1) {
            Teacher teacher = new Teacher(args[0]);
            teacher.display();
        }
        // if args.length is equal to 2, call the Constructor with 2 arguments
        else if (args.length == 2) {
            Teacher t2 = new Teacher(args[0], Integer.parseInt(args[1]));
            t2.display();
        }
    }
}
