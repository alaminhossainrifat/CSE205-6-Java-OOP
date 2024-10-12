package Online3.Question3;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5); 

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        
        queue.enqueue(60);

        System.out.println("Front item is: " + queue.peek());

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        System.out.println("Front item is: " + queue.peek());

        queue.enqueue(60);
        queue.enqueue(70);

        System.out.println("Current size: " + queue.size());

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }

        queue.dequeue();
    }
}

