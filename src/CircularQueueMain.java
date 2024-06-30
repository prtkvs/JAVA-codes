public class CircularQueueMain {
    public static void main(String[] args) throws Exception{
        CircularQueue circularQueue = new CircularQueue(6);
        circularQueue.insert(12);
        circularQueue.insert(9);
        circularQueue.insert(5);
        circularQueue.insert(1);
        circularQueue.insert(23);
        circularQueue.insert(89);
        circularQueue.display();
        System.out.println(circularQueue.remove());
        circularQueue.display();
    }
}
