public class ChatApplication {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No message provided. Please enter a message.");
        } else {
            String message = args[0];

            if (args.length > 1) {
                try {
                    int repeatCount = Integer.parseInt(args[1]);

                    for (int i = 0; i < repeatCount; i++) {
                        System.out.println(message);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid repeat count. Please enter a valid number.");
                }
            } else {
                System.out.println(message);
            }
        }
    }
}
