import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> Numbers = new LinkedList<Integer>();
        Numbers.add(6);
        Numbers.add(8);
        Numbers.add(3);
        Iterator<Integer> itr = Numbers.iterator();
        while (itr.hasNext()) {
            int id = itr.next();
            System.out.println(id);
        }
        // System.out.println("Before:" + Numbers.get(1));
        // Numbers.set(1, 2);
        // System.out.println("After:" + Numbers.get(0));
    }
}