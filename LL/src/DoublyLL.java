public class DoublyLL {
        private Node head;
        public void insertFirst(int value){
            Node node = new Node(value);
            node.next=head;
            node.prev=null;
            if(head!=null){
                head.prev=node;
            }
            head = node;
        }
        public void insertLast(int value){
            Node node = new Node(value);
            Node last = head;        //start last from head
            node.next = null;

            if (head==null){
                head = node;
                node.prev= null;
            }
            while(last.next!=null){
                last = last.next;
            }
            last.next= node;
            node.prev=last;
        }
        public Node find(int value){                  //copy with caution
            Node node = head;                         //gives a pointer to a before index
            while(node != null) {
                if (node.value == value){
                    return node;
                }
                node = node.next;
            }
            return null;
        }
        public void insertIndex(int after , int value){
            Node p = find(after);
            if (p==null){
                System.out.println("Does'nt exist");
                return;
            }
            Node node = new Node(value) ;           //box needed to be inserted is created
            node.next = p.next;
            p.next = node;
            node.prev= p;
            if (node.next!=null) {                 //since this will create null pointer exception
                node.next.prev = node;
            }
        }

        public void display(){
            Node node = head;
            Node last = null;
            while(node!=null){
                System.out.print(node.value+" -> ");
                last = node;
                node= node.next;
            }
            System.out.println("End");

            System.out.println("Print in reverse");

            while(last!= null){
                System.out.print(last.value+" -> ");
                last = last.prev;
            }
            System.out.println("START");
            System.out.println();
        }
        private class Node{
            int value;
            Node next;
            Node prev;

            public Node(int value) {
                this.value = value;
            }

            public Node(int value, Node next, Node prev) {
                this.value = value;
                this.next = next;
                this.prev = prev;
            }
        }
    }
