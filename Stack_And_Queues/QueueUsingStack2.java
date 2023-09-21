package Stack_And_Queues;
import java.util.Stack;

public class QueueUsingStack2 {

    private Stack<Integer> first;
    private Stack<Integer> second;

    QueueUsingStack2() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) {
        // Transfer elements from the first stack to the second stack
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        // Add the new item to the first stack
        first.push(item);
        // Transfer elements back to the first stack
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return first.pop();
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return first.peek();
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }

    public static void main(String[] args) throws Exception {
        QueueUsingStack2 queue = new QueueUsingStack2();
        queue.add(12);
        queue.add(4);
        queue.add(78);
        System.out.println(queue.remove()); // Should print 12
        
    }
}
