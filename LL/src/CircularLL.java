public class CircularLL {
    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    private Node head;
    private Node tail;

    public CircularLL() {
        this.head = head;
        this.tail = tail;
    }
    public void insert(int val){
        Node node = new Node(val);
        if (head==null){
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next= head;
        tail= node;
    }
    public void delete(int val){
        Node node = head;
        if (node == null){
            return;
        }
        if (node.val==val){
            head= head.next;
            tail.next=head;
            return;
        }
        do{
            Node n = node.next;
            if (n.val==val){
                node.next=n.next;
                break;
            }
            node = node.next;
        }while(node!=head);
    }
    public void display(){
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            }while(node!=head);
        }
        System.out.println("Pointing to Head");
    }
}
