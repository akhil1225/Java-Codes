public class LogicalOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // Logical AND (&&)
        System.out.println("a && b: " + (a != 0 && b != 0)); // true

        // Logical OR (||)
        System.out.println("a || b: " + (a != 0 || b != 0)); // true

        // Logical NOT (!)
        System.out.println("!a: " + (a == 0)); // false
    }
}
