import java.util.ArrayList;
import java.util.List;

public class NaiveStringMatching {
    public static List<Integer> naiveStringMatching(String text, String pattern) {
        List<Integer> occurrences = new ArrayList<>();
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.toCharArray()[i + j] != pattern.toCharArray()[j]) {
                    break;
                }
            }
            if (j == m) { // Match found
                occurrences.add(i);
            }
        }

        return occurrences;
    }

    public static void main(String[] args) {
        String text = "AAFDHGHHBFHAFJJAMCNNGHHABCHAJFJGHTNDA";
        String pattern = "A";
        List<Integer> occurrences = naiveStringMatching(text, pattern);
        System.out.println("Occurrences found at positions: " + occurrences);
    }
}
