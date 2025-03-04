public class Array {
    public static void main(String[] args) {
        // Creating a one-dimensional array
        int[] myArray = {10, 20, 30, 40, 50};

        // Displaying the contents of the array
        System.out.println("Contents of the array:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index " + i + ": " + myArray[i]);
        }
    }
}