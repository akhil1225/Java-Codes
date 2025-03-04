public class Kadane {
    public static int kadane(int[] arr) {
        int maxEndingHere = arr[0], maxSoFar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -10, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = kadane(arr);
        System.out.println("The maximum sum of the subarray is: " + maxSum);
    }
}
