public class PrintAverageValue {
    public static void printAverageValue(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;
        System.out.println("Average value: " + average);
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7,8,10 };
        printAverageValue(arr);
    }
}
