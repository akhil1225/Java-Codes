import java.util.*;

class Element {
    int Value;
    int Priority;

    public Element(int value, int priority) {
        this.Value = value;
        this.Priority = priority;
    }
}

public class PriorityQueueUsingArray {
    static List<Element> priorityQueue = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("No of elements: "); // Added prompt for the number of elements.
        int n = scanner.nextInt();
        System.out.println("Elements and their priorities:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            int value = scanner.nextInt();
            System.out.print("Priority: ");
            int priority = scanner.nextInt();
            insertElement(value, priority);
        }

        while (true) {
            System.out.println("\nPriority Queue Operations:");
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Display Elements");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Element: ");
                    int value = scanner.nextInt();
                    System.out.print("Priority: ");
                    int priority = scanner.nextInt();
                    insertElement(value, priority);
                    break;
                case 2:
                    deleteElement();
                    break;
                case 3:
                    displayElements();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    static void insertElement(int value, int priority) {
        Element newEle = new Element(value, priority);
        int i = 0;
        while (i < priorityQueue.size() && priorityQueue.get(i).Priority >= priority) {
            i++;
        }
        priorityQueue.add(i, newEle);
    }

    static void deleteElement() {
        if (priorityQueue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            Element delEle = priorityQueue.remove(0);
            System.out.println("Removed Element -> Value: " + delEle.Value + ", Priority: " + delEle.Priority);
        }
    }

    static void displayElements() {
        if (priorityQueue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue Elements:");
            for (Element element : priorityQueue) {
                System.out.println("Value: " + element.Value + ", Priority: " + element.Priority);
            }
        }
    }
}
