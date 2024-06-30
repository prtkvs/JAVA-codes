import java.util.Stack;

public class InBuiltExamplesStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);        //first item on stack
        stack.push(12);
        stack.push(23);
        stack.push(2);
        stack.push(7);          //last item on stack
        System.out.println(stack.pop());   //pops last item first i.e 7
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
