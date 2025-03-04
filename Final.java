public class Final {
    final int MAX_VALUE = 100; // A final variable

    public void display() {
        // MAX_VALUE = 200; // Error: Cannot assign a value to a final variable
        System.out.println("Max Value: " + MAX_VALUE);
    }

    public static void main(String[] args) {
        Final obj = new Final();
        obj.display();
    }
}
