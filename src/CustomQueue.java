public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;      //single pointer jo remove karwayega first se (adding then increasing)

public CustomQueue() {
    this(DEFAULT_SIZE);     //calling the constructor  //dont use dot(.) for calling
}
    public CustomQueue(int size) {
        this.data = new int[size];
    }
    public boolean isFull() {
        return end == data.length ;
    }
    public boolean isEmpty(){
        return end ==0;  //when the queue will be empty
    }
public boolean insert(int item){
    if (isFull()){
        return false;
    }
    data[end]= item;
    end++;
    return true;
}
public int remove() throws Exception{        //shift left by 1 also remove from first
    if (isEmpty()){
        throw new Exception("Queue is empty");
    }
    int removed = data[0];
    for (int i = 1; i < end ; i++) {
        data[i-1]= data[i];
    }
    end--;
    return removed;
}
public int front() throws Exception{        //since first or front element changed
    if (isEmpty()) {
        throw new Exception("Queue is Empty");
    }
    return data[0];
}
public void display(){
    for (int i = 0; i <end ; i++) {      //since inserting from last till first situated at end(where to remove)
        System.out.print(data[i]+" <- ");
    }
    System.out.println("Start");
}
}
