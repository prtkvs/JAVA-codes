 public class Main2 {
        public static void main(String[] args) {
            DoublyLL list = new DoublyLL();
            list.insertFirst(3);
            list.insertFirst(5);
            list.insertFirst(6);
            list.insertFirst(11);
            list.insertFirst(17);
            list.display();
            list.insertLast(99);
            list.display();
            list.insertIndex(6,89);
            list.display();
        }
    }

