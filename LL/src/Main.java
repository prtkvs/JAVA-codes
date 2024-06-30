import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(11);
        list.insertFirst(17); //newly added at initial therefore it will be head
        list.insertLast(99);
        list.indexInsert(100,3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteIndex(3));
        list.display();
    }
}
