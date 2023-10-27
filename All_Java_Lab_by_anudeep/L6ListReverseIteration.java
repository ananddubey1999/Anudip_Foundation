import java.util.LinkedList;
import java.util.ListIterator;

public class L6ListReverseIteration {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding an elements to the LinkedList
        list.add("Raam");
        list.add("Lakshmana");
        list.add("Bharata");
        list.add("Shatrughna");
          
        // // Iterating over the LinkedLlist using an iterator
        ListIterator<String> iterator = list.listIterator(list.size());

        // Iterate over the LinkedList in reverse order
        while (iterator.hasPrevious()) {
            String element = iterator.previous();
            System.out.println(element);
        }
    }
}
