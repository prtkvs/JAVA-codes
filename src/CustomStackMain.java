public class CustomStackMain {
    public static void main(String[] args) throws StackException {
//        CustomStack stack = new CustomStack(6);
//        DynamicStack stack = new DynamicStack(5);
        CustomStack stack = new DynamicStack(6);
        stack.push(4);
        stack.push(12);
        stack.push(23);
        stack.push(2);
        stack.push(7);
        stack.push(9);
//        stack.push(9);     //stack is full
        stack.push(11);  //now no Stack is full
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());  cannot pop from null stack rules and since its custom stack therefore I've already mention it in StackException class . uncomment it and check in run window.
        System.out.println(stack.pop());    //Dynamic Stack is implemented
    }
}
