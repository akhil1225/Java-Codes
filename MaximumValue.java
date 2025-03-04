public class MaximumValue {
    public static void PrintMaximumValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum value: " + max);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 7, 2, 9, 4, 5, 8 };
        PrintMaximumValue(arr);
    }
}
