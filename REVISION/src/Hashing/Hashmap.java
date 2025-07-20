package Hashing;
import java.util.*;
public class Hashmap {
        public static void main(String[] args) {
            System.out.println("----Hashmap-----");
            HashMap<String,Integer> map = new HashMap<>();
            map.put("India",200);
            map.put("UK",400);
            map.put("China",200);
            map.put("USA",100);

            map.put("China",300);

            map.remove("China");

            System.out.println(map.containsKey("India"));
            System.out.println(map.get("USA"));
            System.out.println(map);
            Set<String> keys = map.keySet();
            for(String key: keys){
                System.out.println(key+" "+map.get(key));
            }
        }
    }
