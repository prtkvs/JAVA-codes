import java.util.LinkedList;
import java.util.Queue;

public class InBuiltExamplesQueue {
    public static void main(String[] args) {
//Queue<Integer> queue = new Queue<Integer>()  generates different classes of interface
        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.add(11);
        queue.add(43);
        queue.add(22);
        System.out.println(queue.peek());  //gets the value only
        System.out.println(queue.remove());   //removes it
    }
}
