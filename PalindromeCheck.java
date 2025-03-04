public class PalindromeCheck {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single string as a command-line argument.");
            return;
        }

        String input = args[0];
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
