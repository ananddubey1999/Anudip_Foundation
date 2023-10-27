import java.util.HashMap;

public class L7HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put(01, "Raam");
        map.put(02, "Shyaam");
        map.put(03, "Krihna");
        map.put(04, "Hanumaan");

        // Accessing elements from the HashMap
        String value = map.get(02);
        System.out.println("Value at key 2: " + value);

        // Removing elements from the HashMap
        map.remove(3);

        // Printing all elements in the HashMap
        System.out.println("HashMap elements: " + map);
    }
}

