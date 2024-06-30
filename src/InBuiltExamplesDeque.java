import java.util.ArrayDeque;
import java.util.Deque;

public class InBuiltExamplesDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(23);
        deque.addLast(6);
        deque.removeLast();
        deque.add(2);
        deque.addFirst(32);
        //etc.
    }
}
