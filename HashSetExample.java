import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> Numbers = new HashSet<Integer>();
        Numbers.add(6);
        Numbers.add(8);
        Numbers.add(6);
        System.out.println("Before:" + Numbers.contains(8));
        System.out.println("After:" + Numbers.size());
        for(Integer i: Numbers){
            System.out.println(i);
        }
    }
}

