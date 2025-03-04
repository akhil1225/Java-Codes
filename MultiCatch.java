public class MultiCatch{
    public static void main(String[] args) {
        try {
            // Some code that may throw different types of exceptions
            int result = divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (Exception e) {
            // Generic catch block for any other type of exception
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
