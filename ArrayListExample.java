import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(6);
        Numbers.add(8);
        Numbers.add(3);
        System.out.println("Before:" + Numbers.get(1));
        Numbers.set(1, 2);
        System.out.println("After:" + Numbers.get(3));
    }
}