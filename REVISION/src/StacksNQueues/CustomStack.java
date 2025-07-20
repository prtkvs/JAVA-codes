package StacksNQueues;

//Custom Stack Implementation
public class CustomStack{
    int[] data ; // stored in an array
    private static final int DEFAULT_SIZE = 10;
    //if size not mentioned use DEFAULT_SIZE
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    //if size is mentioned then use it for data array
    public CustomStack(int size){
        this.data = new int[size];
    }
    int ptr = -1;

    //add items - push
    public boolean push(int item){
        if(isFull()){
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    //remove items - pop
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }
        // return data[ptr--]; //LIFO returns data[ptr] then ptr--
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    //peek
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack");
        }
        return data[ptr]; // the one's which'll pop first
    }

    //ifFull
    public boolean isFull(){
        // if(ptr==data.length-1){
        //     return true;
        // }
        // return false;
        return ptr==data.length-1;
    }

    //isEmpty
    public boolean isEmpty(){
        // if(ptr==-1){
        //     return true;
        // }
        // return false;
        return ptr == -1;
    }

    //Display - got stucked
    public void display(){
        for (int i=0;i<=ptr ;i++ ){
            System.out.print(data[i]+"->");
        }
        System.out.print("END");
    }


    public static void main (String[] args) throws Exception {
        CustomStack stack = new CustomStack(6);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.display();
    }
}
