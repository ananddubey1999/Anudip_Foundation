import java.util.LinkedList;
public class L6RetrieveLastElement {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add("Raam");
        list.add("Shyaam");
        list.add("Vishnu");
        list.add("Mahadev");

        // Retrieve the last element without removing it
        String lastElement = list.getLast();

        // Print the last element
        System.out.println("Last Element is : " + lastElement);
    }
}
