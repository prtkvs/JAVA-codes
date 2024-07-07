 import java.util.*;

public class InBuiltExamples {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);    //first (FILO)
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);    //Last (LIFO)

        System.out.println(stack.pop());   //18
        System.out.println(stack.pop());   //9
        System.out.println(stack.pop());   //2
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3); //first (FIFO)
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);   //last (LILO)

        System.out.println(queue.remove());  //3
        System.out.println(queue.remove());  //6
        System.out.println(queue.peek());    //5 peek-gets the item that's currently at first in the line.

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.add(64);
        deque.add(52);
        deque.add(45);
        deque.addLast(78);
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque);
        // etc etc
    }
}