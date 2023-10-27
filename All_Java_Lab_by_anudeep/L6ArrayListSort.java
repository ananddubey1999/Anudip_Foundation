import java.util.ArrayList;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.Iterator;

public class L6ArrayListSort {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements in to the ArrayList
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(4);

        // Sort the ArrayList in ascending order 
        Collections.sort(list);  //  [1, 2, 4, 5, 8]

        // Printing the sorted ArrayList
        System.out.println("Sorted ArrayList of the elements: " + list);

        
    }
}
