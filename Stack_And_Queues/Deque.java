package Stack_And_Queues;
import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque= new ArrayDeque<>();
        deque.add(12);
        deque.addLast(1);
        deque.add(67);
        deque.addFirst(12);
        System.out.println(deque.remove());  // removes and retrieves  the head of the queue and if empty returns null
        deque.offer(null); // removes and retrieves  the head of the queue if empty throws exception
        deque.poll(); // retrieves but doesn't remove the head of the queue

    }
    
}
