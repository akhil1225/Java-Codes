import java.util.Scanner;

public class PriorityQueueExample {
    static class Node {
        int data;
        int priority;
        Node next;

        public Node(int data, int priority) {
            this.data = data;
            this.priority = priority;
            this.next = null;
        }
    }

    static Node head = null;

    static void enqueue(int data, int priority) {
        Node newNode = new Node(data, priority);
        if (head == null || priority < head.priority) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null && temp.next.priority <= priority) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    static void dequeue() {
        if (head == null) {
            System.out.println("Priority queue is underflow.");
            return;
        }
        int removed = head.data;
        head = head.next;
        System.out.println("Removed element: " + removed);
    }

    static void isEmpty() {
        if (head == null) {
            System.out.println("Priority queue is empty.");
        } else {
            System.out.println("Priority queue is not empty.");
        }
    }

    static void size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Size of the priority queue: " + count);
    }

    static void display() {
        if (head == null) {
            System.out.println("Priority queue is empty.");
        } else {
            Node temp = head;
            System.out.print("Elements in the priority queue: ");
            while (temp != null) {
                System.out.print(temp.data + "(" + temp.priority + ") ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPriority Queue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Check if Empty");
            System.out.println("4. Get Size");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int element = scanner.nextInt();
                    System.out.print("Enter priority of the element: ");
                    int priority = scanner.nextInt();
                    enqueue(element, priority);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    isEmpty();
                    break;
                case 4:
                    size();
                    break;
                case 5:
                    display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
