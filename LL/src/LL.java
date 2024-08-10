public class LL {
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {   //overloading of Node
            this.value = value;
            this.next = next;
        }
    }
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
        Node temp = head;  //already know that head cannot be moved this way till the index so usko temp mein store karke chalao.
        for (int i = 1; i < index; i++) {   //i.e if the index is 3 , you have to go till 2  and starting from 1 since 0 is head itself from where temp is starting
            temp = temp.next;    //reaches till 2nd index
        }
        Node node = new Node(value, temp.next);   //create that node to insert in between. There the value is something e.g 7 and temp.next to connect it with next one(3rd index) 7->8(now 4th index)
        temp.next = node;                        //assigning 3rd index to 7 (9->7->8)
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
        if (size <= 1) {    //null items
            return deleteLast();
        }
        Node secondLast = get(size - 2);    //get method below
        int value = tail.value;
        tail = secondLast;      //since putting secondLast as tail not tail as secondLast
        tail.next = null;
        size--;
        return value;
    }

    public Node get(int index) {            //for deleting last
        Node node = head;
        for (int i = 0; i < index; i++) {     //zero since node is an item of LL
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
        Node prev = get(index-1);          //index-1 becoz previous is behind that index i.e to be deleted
        int value = prev.next.value;   //not prev.value.next since you're not taking the value and doing next rather you're taking next one's value.
        //now to break the older chain
        prev.next= prev.next.next;
        size--;
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
}

