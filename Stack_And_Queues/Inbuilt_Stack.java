package Stack_And_Queues;

import java.util.Stack;

public class Inbuilt_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();  // create an object of stack

        stack.push(14); // push is used to insert element
        stack.push(95);
        stack.push(78);
        stack.push(8);
        stack.push(15);
        stack.push(16);

        System.out.println(stack.pop()); // pop is used to remove an element and it removes the last element first
                                        // as it works as LIFO or FILO
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop()); // and if you try to remove from an empty stack you wil get emptystackexception
    }
}
