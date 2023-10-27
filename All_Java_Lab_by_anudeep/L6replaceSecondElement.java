import java.util.ArrayList;

public class L6replaceSecondElement {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Mahadev");
        list.add("Gopal");
        list.add("Vishnu");
        list.add("Shyaam");

        // Specify the element to replace with the element which is at index 1
        String newElement = "Raam";

        // Replace the second element with the specified element
        list.set(1, newElement);
        System.out.println("ArrayList after replacement: " + list);
    }
}
