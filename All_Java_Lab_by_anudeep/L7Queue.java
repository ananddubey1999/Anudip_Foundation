import java.util.*;
public class L7Queue {
    public static void main(String[] args) {
        // Creating a Queue
        Queue<String> q = new LinkedList<>();

        // Adding elements to the Queue
        q.add("Raam");
        q.add("Shyaam");
        q.add("Krishna");

        // Retrieving elements from the Queue
        String element1 = q.peek(); // Retrieves the head element without removing it
        System.out.println("Head element: " + element1);

        String element2 = q.poll(); // Retrieves and removes the head element
        System.out.println("Removed element: " + element2);

        // Removing elements from the Queue
        boolean isRemoved = q.remove("Shyaam");
        System.out.println("Is 'Shyaam' removed from the Queue? " + isRemoved);

        // Printing all elements in the Queue
        System.out.println("Queue elements: " + q);
    }
}
