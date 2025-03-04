public class MinimumValue {
    public static void printMinimumValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum value: " + min);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 7, 2, 9, 4, 5, 8 };
        printMinimumValue(arr);
    }
}
