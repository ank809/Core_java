package Stack_And_Queues;
// for inserting efficiently i.e 0(1) and removing inefficiently i.e O(N)

import java.util.Stack;

public class QueueUsingStacks1 {
        private Stack<Integer> first;
        private Stack<Integer> second;

        QueueUsingStacks1(){
            first= new Stack<>();
            second= new Stack<>();
        }

        // for inserting elements
        public void insert(int item){
            first.push(item);
        }

        // for removing element from stack
        public int remove(){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            int removed= second.pop();

            while(!second.isEmpty()){
                first.push(second.pop());
            }

            return removed;
        }

        // for finding peek  element
        public int peekElement(){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            int peek= second.peek();

            while(!second.isEmpty()){
                first.push(second.pop());
            }
            return peek;
        }

        public boolean isEmpty(){
            return first.isEmpty();
        }
    public static void main(String[] args) {
        QueueUsingStacks1 queue=new QueueUsingStacks1();
        queue.insert(17);
        queue.insert(12);
        queue.insert(78);
        System.out.println(queue.peekElement());
        System.out.println(queue.remove());
    }
}
