import java.util.HashMap;
import java.util.HashSet;

public class Hashmaps {
    public static void main(String[] args) {
            hashDemo();
        }
    public static void hashDemo(){
        HashMap<String , Integer> map = new HashMap<>();
        map.put("kunal",89);
        map.put("civo" , 99);
        map.put("Rohan", 95);
        System.out.println(map.get("kunal"));
        System.out.println(map.getOrDefault("prateek",94)); //if not present in map then it'll assign default value
        System.out.println(map.containsKey("Rohan"));
        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(32);
        set.add(21);
        set.add(56);    // will not consider duplicate values
        set.add(89);
        System.out.println(set);
    }
}
