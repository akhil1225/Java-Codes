public class FinalParameterExample {
   
    public void printMessage( final String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        FinalParameterExample example = new FinalParameterExample();
        String x = "5";
        example.printMessage(x);
    }
}
