public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int front = 0;      //elements lie between front and end only
    protected int end = 0;
    private int size = 0;
    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        this.data = new int[size];
    }
    public boolean isFull() {
        return size == data.length ; //not end because it will move and come at 0 again too
    }
    public boolean isEmpty(){
        return size ==0;
    }

    public boolean insert(int item){
        if (isFull()){
            return false;
        }
//        data[end]= item;
//        end++;
        data[end++]=item;    //write directly
        end= end% data.length;
        size ++;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
       int removed = data[front++];      //therefore piche wale remove ho jayenge (consider items only between front and end)
       front %= data.length;
       size--;
       return removed;
    }
    public int front() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        return data[front];    //ofcourse ,since 0 may contain end
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }
}
