import java.util.HashSet;
public class L6HashSetClear {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding an elements in to the HashSet
        set.add("Arjun");
        set.add("Bheem");
        set.add("Yudhishthir");
        set.add("Nakul");
        set.add("Sahadev");

        // Remove all elements from the HashSet
        set.clear();

        // Print the HashSet after removing all elements
        System.out.println("HashSet after clearing: " + set);
    }
}
