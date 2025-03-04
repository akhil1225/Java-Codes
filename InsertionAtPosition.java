public class InsertionAtPosition {
    public static void main(String[] args) {
        // Initialize an array with elements 1, 2, 3, 4, 5
        int[] array = {1, 2, 3, 4, 5};

        // Initialize the current size of the array
        int currentSize = array.length;

        System.out.println("Insertion at Position Program:");

        // Display the initial array
        System.out.print("Initial Array: ");
        displayArray(array, currentSize);

        // Insert at the specified position
        int insertPosition = 2;  // Example: Insert at position 2
        int elementToInsert = 99;  // Example: Element to insert is 99

        if (insertPosition < 0 || insertPosition > currentSize) {
            System.out.println("Invalid position to insert.");
        } else {
            // Shift elements to make space for the new element
            for (int i = currentSize - 1; i >= insertPosition; i--) {
                array[i + 1] = array[i];
            }

            // Insert the new element
            array[insertPosition] = elementToInsert;

            System.out.println("Element inserted successfully.");
            currentSize++;
        }

        // Display the modified array
        System.out.print("Modified Array: ");
        displayArray(array, currentSize);
    }

    private static void displayArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
