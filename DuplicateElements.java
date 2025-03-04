import java.util.ArrayList;


public class DuplicateElements {
    public static int[] removeDuplicates(int[] array) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int value : array) {
            if (!uniqueList.contains(value)) {
                uniqueList.add(value);
            }
        }

        int[] uniqueArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }

        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 7, 2, 9, 4, 7, 3, 5, 8, 9, 2 };
        int[] result = removeDuplicates(arr);

        System.out.println("Array with duplicates removed: " +result);
    }
}
