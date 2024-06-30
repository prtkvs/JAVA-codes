public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);     //calling the constructor
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot pop from an empty stack");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];   //shortcut for 27 to 29
    }
    public int peek() throws StackException{
        if (isEmpty()){
            throw new StackException("Cannot peek from empty stack");
        }
        return data[ptr];    //check for data.length -1 cuz we peek from top only in stack
    }
    public boolean isFull() {
        return ptr == data.length -1; //ptr is at last index
    }
    public boolean isEmpty(){
        return ptr ==-1;  //when the stack will be empty
    }

}
