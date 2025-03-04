public class DeleteElementInArray {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5};
        
        // Element to delete
        int elementToDelete = 3;

        // Find the index of the element to delete
        int indexToDelete = findElementIndex(array, elementToDelete);

        // Check if the element was found
        if (indexToDelete != -1) {
            // Delete the element at the found index
            deleteElement(array, indexToDelete);

            // Display the updated array
            System.out.print("Original Array: ");
            displayArray(array);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    // Method to find the index of an element in an array
    private static int findElementIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Element not found
    }

    // Method to delete an element at a specific index in an array
    private static void deleteElement(int[] arr, int index) {
        // Shift elements to remove the element at the specified index
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        
       
    }

    // Helper method to display an array
    private static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
