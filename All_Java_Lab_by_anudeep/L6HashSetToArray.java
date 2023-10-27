import java.util.HashSet;
import java.util.Iterator;
public class L6HashSetToArray {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Raam");
        set.add("Shyaam");
        set.add("Shiva");
        set.add("Krishna");

        // Converting the HashSet to an array
        String[] arr = new String[set.size()];
        set.toArray(arr);

        // Printing the array elements
        System.out.println("Array elements are:");
        for (String fruit : arr) {
            System.out.println(fruit);
        }
    }
}
