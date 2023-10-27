 import java.util.HashSet;
import java.util.Iterator;
public class L6HashSet {
        public static void main(String[] args) {
            // Creating a HashSet
            HashSet<String> set = new HashSet<>();
    
            // Adding Element to HasSet 
            set.add("Vishnu");
            set.add("Raam");
            set.add("Shyaam");
            set.add("Hari");
            set.add("Krishna");
            set.add("Mahadev");
            set.add("Ganesha");
            set.add("Bajrangi");
    
            // Iterating over the HashSet using an iterator
            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext()) {
                String God = iterator.next();
                System.out.println(God);
            }
                // here you can also use for loop for iterator
            // for (String name : set) {
            //     System.out.println(name);
            // }
            }  
    }
 
    
    
    
    