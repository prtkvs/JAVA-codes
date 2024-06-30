public class LL {
    private Node head;
    private Node tail;
    int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {        //only 1 node = head =tail
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);

        } else {
            Node node = new Node(value);
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void indexInsert(int value, int index) {      //since we have value and to place at index + we have already made a constructor which takes two value at start
        if (index == 0) {
            insertFirst(value);
        }
        if (index == size) {
            insertLast(value);
        }
        Node temp = head;                 //already know that node cannot be moved this way till the index so usko temp mein store karke chalao.
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);   //create that node to insert in between
        temp.next = node;                        //place it at temp after reaching next at index
        size++;
    }
//    public Node find(int value){
//        Node node = head;                         //gives a pointer to a before index
//        while(node != null) {
//            if (node.value == value){
//                return node;
//            }
//            node = node.next;
//        }
//        return null;
//    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteLast();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }

    public Node get(int index) {            //for deleting last
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public int deleteIndex(int index){
        if (index==0){
            return deleteFirst();
        }
        if (index==size-1){
            return deleteLast();
        }
        Node prev = get(index);
        int value = prev.next.value;
        //now to break the older chain
        prev.next= prev.next.next;
        return value;
    }
    public void display(){
        Node temp = head;
        while ( temp != null){
            System.out.print(temp.value+" -> ");
            temp= temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}

