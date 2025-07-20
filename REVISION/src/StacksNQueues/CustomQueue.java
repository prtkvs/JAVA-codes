package StacksNQueues;

//Custom QUEUE Implementation
public class CustomQueue{
    int[] data ; // stored in an array
    private static final int DEFAULT_SIZE = 10;
    //if size not mentioned use DEFAULT_SIZE
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    //if size is mentioned then use it for data array
    public CustomQueue(int size){
        this.data = new int[size];
    }
    int end = 0;

    //add items
    public boolean add(int item){
        if(isFull()){
            return false;
        }
        // end++;
        // data[end] = item;    -> problem -> pehle daalo 0 pe fir increase
        data[end] = item;
        end++;
        return true;
    }

    //remove items - remove
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty queue");
        }
        // return data[ptr--]; //LIFO returns data[ptr] then ptr--
        int removed = data[0];
        for (int i=1; i<end ;i++ ){ //check conditons DOUBT
            data[i-1] = data[i];
        }
        end--;  // you forgot this
        return removed;
    }

    //peek
    public int offer() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack");
        }
        return data[0]; // the one's which'll pop first
    }

    //ifFull
    public boolean isFull(){
        // if(ptr==data.length-1){
        //     return true;
        // }
        // return false;
        return end==data.length;
    }

    //isEmpty
    public boolean isEmpty(){
        // if(ptr==-1){
        //     return true;
        // }
        // return false;
        return end == 0;
    }

    //Display - got stucked
    public void display(){
        for (int i=0;i<end ;i++ ){
            System.out.print(data[i]+" <- ");
        }
        System.out.print("END");
    }


    public static void main (String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        System.out.println(queue.remove());
        System.out.println(queue.offer());
        queue.display();
    }
}
