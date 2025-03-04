import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = s.next();

        System.out.print("Enter the second word: ");
        String word2 = s.next();

        int length1 = word1.length();
        int length2 = word2.length();

        System.out.println("Length of word1: " + length1);
        System.out.println("Length of word2: " + length2);

        if (length1 == length2) {
            // If words have the same length, compare them lexicographically
            if (word1.compareTo(word2) < 0) {
                System.out.println(word1 + " comes before " + word2);
            } else if (word1.compareTo(word2) > 0) {
                System.out.println(word2 + " comes before " + word1);
            } else {
                System.out.println("word1 and word2 are equal");
            }
        } else {
            // If words have different lengths, print the longer one first
            System.out.println((length1 > length2 ? word1 : word2) + " comes before " + (length1 > length2 ? word2 : word1));
        }
    }
}
