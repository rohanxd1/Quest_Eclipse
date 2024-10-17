package Collections_Study;

import java.util.HashSet;
import java.util.Iterator;

public class Set_test {
    public static void main(String[] args) {
        // Create a HashSet and add numbers from 1 to 50
        HashSet<Integer> obj = new HashSet<Integer>();

        // Adding numbers from 1 to 50
        for (int i = 100; i >= 1; --i) {
            obj.add(i);
        }

        // Iterate through the HashSet and print each element
        Iterator<Integer> itr = obj.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
