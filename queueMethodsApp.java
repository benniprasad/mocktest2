public class queueMethodsApp {
    private Node front;
    private Node rear;

    private class Node {
        int data;
        Node next;

        Node(int item) {
            data = item;
            next = null;
        }
    }

    // Initialize an empty queue
    public queueMethodsApp() {
        front = null;
        rear = null;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Enqueue (add) an element to the queue
    public void enqueue(int item) {
        Node newNode = new Node(item);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println("Enqueued item: " + item);
    }

    // Dequeue (remove) an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow: Cannot dequeue item. Queue is empty.");
            return -1;
        }

        int item = front.data;
        front = front.next;

        // If front becomes null, update rear to null as well
        if (front == null) {
            rear = null;
        }

        System.out.println("Dequeued item: " + item);
        return item;
    }

    public static void main(String[] args) {
        queueMethodsApp queue = new queueMethodsApp();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}