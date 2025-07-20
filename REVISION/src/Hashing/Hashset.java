package Hashing;
import java.util.*;
public class Hashset {
    public static void main(String[] args) {
            HashSet<Integer> set = new HashSet<>();
            set.add(1);
            set.add(3);
            set.add(4);
            set.add(2);
            set.add(1);
            System.out.println(set.contains(4));
            Iterator it = set.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
    }
