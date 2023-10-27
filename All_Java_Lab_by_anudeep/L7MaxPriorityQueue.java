// import java.util.PriorityQueue;
// import java.util.Collections;
import java.util.*;
public class L7MaxPriorityQueue {
    public static void main(String[] args) {
        // Creating a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        pq.add(4);
        pq.add(9);
        pq.add(1);
        pq.add(3);

        // Changing the PriorityQueue to a maximum priority queue
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        maxPQ.addAll(pq);

        // Printing elements of the maximum priority queue
        while (!maxPQ.isEmpty()) {
            System.out.println(maxPQ.poll());
        }
    }
}
