import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {

    public static int[] removeElement(int[] arr, int element) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != element) {
                arr[count++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the element to be removed
        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

        // Call the removeElement method to remove the element
        int[] modifiedArray = removeElement(arr, elementToRemove);

        // Display the modified array
        System.out.println("Array after removing " + elementToRemove + ":");
        for (int i = 0; i < modifiedArray.length; i++) {
            System.out.print(modifiedArray[i] + " ");
        }
        System.out.println();
    }
}
