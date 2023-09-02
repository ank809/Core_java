package Stack_And_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Inbuilt_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>(); // queue is an interface 
                                                // LinkedList have Deque which extends Queue
        queue.add(12);
        queue.add(78);
        queue.add(15);
        queue.add(14);
        queue.add(56);
        queue.add(89);
        System.out.println(queue.peek()); // it returns the first element 
        System.out.println(queue.remove()); // it removes the first element
    }
    
}
