public class Main3 {
    public static void main(String[] args) {
        CircularLL list  = new CircularLL();
        list.insert(8);
        list.insert(16);
        list.insert(20);
        list.insert(17);
        list.display();
        list.delete(20);
        list.display();
    }
}

