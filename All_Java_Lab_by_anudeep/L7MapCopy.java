import java.util.*;
public class L7MapCopy {  
    public static void main(String[] args) {
        // Source map
        Map<Integer, String> map = new HashMap<>();
        map.put(01, "Raam");
        map.put(02, "shyaam");
        map.put(03, "krishna");

        // Copy map
        Map<Integer, String> mapCopy = new HashMap<>();

        // Copying all mappings from the map to the mapCopy
        mapCopy.putAll(map);

        //Now Printing the mapCopy
        System.out.println("Copy Map: " + mapCopy);
    }
}
