public class LL{
    class Node{
        Node next;
        int val;
        public Node(Node next, int val){
            this.val=val;
            this.next=next;
        }
        public Node(int val){
            this.val=val;
        }
    }
    private Node head;
    private Node tail;
    int size;

    public LL(){
        this.size=0; //declare size first
    }

    //InsertFirst
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head; // assigning
        head = node; //validating
        //null ptr Exception
        if (tail == null){
            tail = head; //assign that new head value to tail also
        }
        size++;
    }

    //InsertLast
    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //InsertIndex
    public void insertIndex(int val, int index){
        //two conditions based on index position
        if(index==0){
            insertFirst(val);
        }
        if(index == size-1){
            insertLast(val);
        }
        Node temp = head;
        for (int i=1;i<index ;i++ ){ // 1 se start in insert and 0 se start in Delete
            temp = temp.next; //index se ek pehle tk
        }
        Node node = new Node(temp.next,val);
        //socho...socho...socho  ? DOUBT - done (good)
        temp.next = node; // good
        // node = temp.next.next;  //doubt line -> no need of this
        size++;
    }

    //Delete first
    public void deleteFirst(){
        if(head == null){
            return;
        }
        head = head.next;
        size--;
    }

    //Delete Last -> size-2 = secondLast concept
    // get function O(n)
    public Node get(int index){
        Node node = head;
        for (int i=0;i<index ;i++ ){
            node = node.next;
        }
        return node;
    }

    public void deleteLast(){
        if(size<=1){ //Doubt in null ptr Exception - corrected
            return;
        }
        Node secondLast = get(size-2);
        tail = secondLast;
        tail.next = null; // p+p+p
        size--;
    }

    //Delete Index -> prev concept
    public void deleteIndex(int index){
        // was doubt in null ptr Exception - use insertIndex concept
        if(index==0){
            deleteFirst();
        }
        if(index == size-1){
            deleteLast();
        }
        Node prev = get(index-1);
        prev.next = prev.next.next;
        size--;
    }
    //Display -> while loop
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
//    public static void main (String[] args) {
//        LL list = new LL();
//        list.insertFirst(21);
//        list.insertFirst(19);
//        list.insertFirst(17);
//        list.insertFirst(13);
//        list.insertFirst(11);
//        list.insertFirst(7);
//        list.insertFirst(5);
//        list.insertLast(23);
//        list.insertIndex(15,4); //val,index
//        list.deleteFirst();
//        list.deleteLast(); // problem -> corrected
//        list.deleteIndex(4); // problem -> corrected
//        list.insertIndex(17,4);
//        list.display();
//    }
}