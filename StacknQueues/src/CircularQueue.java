public class CircularQueue{
    int[] data ;
    private static final int DEFAULT_SIZE = 10;

    public CircularQueue(){
        this(DEFAULT_SIZE); // mtlb kuch size nhi mentioned to direct use this
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    int first =0;
    int end = 0;
    int end_ptr =0;

    public boolean isFull(){
        return end_ptr == data.length;
    }
    public boolean isEmpty(){
        return end_ptr == 0;
    }

    //add items - end badhega
    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++] = item;
        end = end%data.length;
        end_ptr++;
        return true;
    }
    // remove items = first ko badhao
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Can't remove from empty queue");
        }
        int removed = data[0];
        first++;
        first= first%data.length;
        end_ptr--;
        return removed;
    }
    // offer item
    public int offer() throws Exception{
        if(isEmpty()){
            throw new Exception("Can't offer from empty queue");
        }
        return data[first]; //doubt- cleared
    }

    public void display(){ //empty case lelo aur do while loop use
        if(isEmpty()){
            System.out.print("Empty Queue");
        }
        int i = first; // doubt : cleared - first se end show krna hai
        do{
            System.out.print(data[i]+" -> ");
            i++;
            i=i%data.length;
        }while(i!=end);  // equality doubt
        System.out.println("END");
    }
//    public static void main (String[] args) throws Exception {
//        CircularQueue cq = new CircularQueue(10);
//        cq.insert(1);
//        cq.insert(2);
//        cq.insert(3);
//        cq.insert(4);
//        cq.insert(5);
//        cq.insert(6);
//        cq.remove();
//        cq.display();
//        System.out.println(cq.offer());
//    }
}