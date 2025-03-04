public class ThrowExample {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException("This is an example exception");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
