import java.util.Scanner;

class InterviewProcess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Did you clear the written test? (yes/no): ");
        String writtenTestResult = scanner.nextLine();

        if (writtenTestResult.equalsIgnoreCase("yes")) {
            System.out.println("You are eligible for the group discussion round");

            System.out.print("Did you pass the group discussion round? (yes/no): ");
            String groupDiscussionResult = scanner.nextLine();

            if (groupDiscussionResult.equalsIgnoreCase("yes")) {
                System.out.println("You are eligible for the technical round");

                System.out.print("Did you pass the technical round? (yes/no): ");
                String technicalRoundResult = scanner.nextLine();

                if (technicalRoundResult.equalsIgnoreCase("yes")) {
                    System.out.println("Congrats! You are eligible for the HR round");
                } else {
                    System.out.println("Sorry, you can go home");
                }
            } else {
                System.out.println("Sorry, you can go home");
            }
        } else {
            System.out.println("Sorry, you can go home");
        }

        scanner.close();
    }
}
