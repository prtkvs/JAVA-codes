import java.util.*;
public class generic {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        //list.add(3245) error at compile time
        List anotherlist = new ArrayList<>();
        anotherlist.add(123);
        anotherlist.add("any object");
        System.out.println(list);
        System.out.println(anotherlist);
    }
}
