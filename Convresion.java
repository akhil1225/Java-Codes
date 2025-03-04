import java.util.Stack;
import java.util.Scanner;

public class Convresion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the infix expression: ");
        String infixExpression = scanner.nextLine();

        String reversedInfix = reverseString(infixExpression);
        String prefixExpression = convertToPrefix(reversedInfix);
        String finalPrefixExpression = reverseString(prefixExpression);

        System.out.println("Original Infix Expression: " + infixExpression);
        System.out.println("Prefix Expression: " + finalPrefixExpression);

        displayTable(infixExpression, finalPrefixExpression);
    }

    private static String convertToPrefix(String reversedInfix) {
        StringBuilder prefix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < reversedInfix.length(); i++) {
            char currentChar = reversedInfix.charAt(i);

            if (Character.isLetterOrDigit(currentChar)) {
                prefix.append(currentChar);
            } else if (currentChar == ')') {
                stack.push(currentChar);
            } else if (currentChar == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    prefix.append(stack.pop());
                }
                stack.pop(); // Pop the corresponding ')'
            } else {
                while (!stack.isEmpty() && getPrecedence(stack.peek()) >= getPrecedence(currentChar)) {
                    prefix.append(stack.pop());
                }
                stack.push(currentChar);
            }
        }

        while (!stack.isEmpty()) {
            prefix.append(stack.pop());
        }

        return prefix.toString();
    }

    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    private static void displayTable(String infixExpression, String finalPrefixExpression) {
        System.out.println("\nConversion Table:");
        System.out.println("-------------------------------------------------------");
        System.out.printf("| %-5s | %-10s | %-20s |\n", "Scan", "Stack", "Expression");
        System.out.println("-------------------------------------------------------");

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infixExpression.length(); i++) {
            char currentChar = infixExpression.charAt(i);

            if (Character.isLetterOrDigit(currentChar)) {
                stack.push(currentChar);
            } else if (currentChar == '(') {
                while (!stack.isEmpty()) {
                    System.out.printf("| %-5s | %-10s | %-20s |\n", currentChar, stack, finalPrefixExpression);
                    finalPrefixExpression = finalPrefixExpression.substring(1);
                    stack.pop();
                }
            } else {
                stack.pop();
                System.out.printf("| %-5s | %-10s | %-20s |\n", currentChar, stack, finalPrefixExpression);
            }
        }

        while (!stack.isEmpty()) {
            System.out.printf("| %-5s | %-10s | %-20s |\n", " ", stack, finalPrefixExpression);
            stack.pop();
        }

        System.out.println("-------------------------------------------------------");
    }
}
