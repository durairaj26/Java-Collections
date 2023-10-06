import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> Names = new HashMap<Integer,String>();
        Names.put(6,"Alice");
        Names.put(8,"Rose");
        Names.put(3,"David");
        System.out.println("Before:" + Names.get(6));
        Names.put(6,"Tom");
        System.out.println("After:" + Names.get(6));
        System.out.println("After:" + Names.size());
    }
}