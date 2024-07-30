import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(76);
        heap.insert(32);
        heap.insert(54);
        heap.insert(89);
        heap.insert(22);
        heap.insert(12);
        heap.insert(18);
        ArrayList list = heap.heapSort();
        System.out.println(list);
    }
}
