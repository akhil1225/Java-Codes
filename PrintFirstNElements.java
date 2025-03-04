public class PrintFirstNElements {
    public static void printFirstNElements(int[] array, int n) {
        if (n > array.length) {
            System.out.println("n is greater than the array length.");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 7, 2, 9, 4, 5, 8 };
        int n = 4;
        printFirstNElements(arr, n);
    }
}
