import java.util.PriorityQueue;

public class StackEx {
    public static void main(String[] args) {
        // Creating a PriorityQueue of integers
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        priorityQueue.add("B");
        priorityQueue.add("A");
        priorityQueue.add("W");
        priorityQueue.add("H");
        // Dequeuing elements based on priority
        System.out.println("PriorityQueue: ");
        
            System.out.println(priorityQueue.poll());
     
        
        
    }
}
