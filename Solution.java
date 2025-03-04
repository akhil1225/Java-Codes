import java.util.*;

class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");
    }
}

public class Solution {
    public static void main(String args[]) {
        Bird bird = new Bird();

        // Take input from args[0] and convert it to lowercase
        for (String arg : args) {
            arg = arg.toLowerCase();

            // Switch statement to perform actions based on the input
            switch (arg) {
                case "walk":
                    bird.walk();
                    break;
                case "fly":
                    bird.fly();
                    break;
                case "sing":
                    bird.sing();
                    break;
                default:
                    System.out.println("Invalid action. Use 'walk', 'fly', or 'sing'.");
            }
        }
    }
}
