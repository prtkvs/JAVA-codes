import java.util.ArrayList;

class Heap <T extends Comparable <T>> {
    private ArrayList <T> list;
    public Heap(){
        list = new ArrayList<>();
    }

    private void swap (int first , int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index){
        return (index-1)/2;
    }
    private int left(int index){
        return index*2 + 1;
    }
    private int right(int index){
        return index*2 + 2;
    }
    // Inserting
    public void insert(T value){  //T is the type parameter of the Heap
        list.add(value); //adding at last index
        upheap(list.size()-1);
    }

    private void upheap(int index) {
        if(index==0){
            return;
        }
        int p = parent(index); //checking from parent of last index
        if (list.get(index).compareTo(list.get(p))<0){  //if index > parent
        swap(index,p);
        upheap(p); // repeat till above for p now
        }
    }

    // Removing
    public T remove() throws Exception{
        if (list.isEmpty()){
            throw new Exception("removing from an empty heap");
        }
        T temp = list.get(0); // first remove item from first index
        T last = list.remove(list.size()-1); //taking last and remove from there(to put on top)
        if (!list.isEmpty()){
            list.set(0,last); //put last item to first index
            downheap(0);
        }
        return temp;
    }

    private void downheap(int index) {
        int min = index;
        int left =  left(index);
        int right = right(index);

        if (left< list.size() && list.get(min).compareTo(list.get(left))>0){ //checking left exist or not & is min>left
            min = left;
        }
        if (right< list.size() && list.get(min).compareTo(list.get(right))>0){
            min = right;
        }
        if (min!=index){  //now calling from next (ab min index nhi raha)
            swap(min,index);
            downheap(min);
        }
    }

    //Heap Sort
    public ArrayList<T> heapSort() throws Exception {
        ArrayList <T> data = new ArrayList<>();
        while(!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }
    // don't memorise just visualise and write code based on theory ( clear concepts of Generics )
}