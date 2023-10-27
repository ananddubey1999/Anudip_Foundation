import java.util.HashSet;
public class L6HashSetClone {
    public static void main(String[] args) {
        // Creating a source HashSet
        HashSet<String> set = new HashSet<>();

        // Adding elements to the source HashSet
        set.add("Lakshmi");
        set.add("Sita");
        set.add("Parvati");
        set.add("Radha");

        // Clone the source HashSet to a new HashSet
        HashSet<String> clonedSet = new HashSet<>(set);

        // Print the cloned HashSet
        System.out.println("Cloned HashSet: " + clonedSet);
    }
}
