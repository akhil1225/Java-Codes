import java.util.Scanner;

public class EasterEgg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Sentence: ");
        String sentence = s.nextLine();

        System.out.print("Enter a word to find: ");
        String word = s.nextLine();

        int res = findWordPos(sentence, word);

        if (res != -1) {
            System.out.print("The word '" + word + "' is found at index " + res + " in the sentence.");
        } else {
            System.out.print("The word '" + word + "' is not in the sentence.");
        }
    }

    public static int findWordPos(String sentence, String word) {
        int index = sentence.indexOf(word);
        if (index != -1) {
            return index + 1; // Adding 1 to get the index starting from 1
        }
        return -1;
    }
}
