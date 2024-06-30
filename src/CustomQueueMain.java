public class CustomQueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(23);
        queue.insert(2);
        queue.insert(9);
        queue.insert(11);
        queue.insert(30);
        queue.display();

    }
}
