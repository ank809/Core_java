package Stack_And_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    class MyStack {
    private Queue<Integer> first;
    private Queue<Integer> second;
    public MyStack() {
        first= new LinkedList<>();
        second= new LinkedList<> ();
    }
    
    public void push(int x) {
        first.add(x);
    }
    
    public int pop() {
       int n= first.size();
       while(n>1){
           second.add(first.poll());
       }
       int remove= first.poll();
       while(!second.isEmpty()){
           first.add(second.poll());
       }
        return remove;
    }
    
    public int top() {
       int n= first.size();
       while(n>1){
           second.add(first.poll());
       }
       int top= first.peek();
       while(!second.isEmpty()){
           first.add(second.poll());
       }
        return top;
    }
    
    public boolean empty() {
       return first.isEmpty();    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
    
}
