class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    private Node head;

    SinglyLinkedList() {
        head = null;
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Delete by key    
    void deleteByKey(int key) {
        if (head == null)
            return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node prev = null;
        Node current = head;
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) return;

        prev.next = current.next;
    }

    // List Traversal
    void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class SinglyLinkedListOps{
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Insertion
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);

        // Traversal
        System.out.println("Linked List:");
        list.traverse();

        // Deletion by key
        list.deleteByKey(3);

        // Traversal after deletion
        System.out.println("Linked List after deletion:");
        list.traverse();
    }
}
