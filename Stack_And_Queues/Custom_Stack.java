package Stack_And_Queues;
public class Custom_Stack {
    int [] data;
    protected final static int  Default_Size=10;

// if the user do no pass anything
    Custom_Stack(){
        this.data= new int[Default_Size];
    }
    // if user pass the size then this constructor is called
    Custom_Stack(int size){
        this.data= new int[size];
    }

    // for inserting element in stack
    int ptr=-1;
    public boolean push(int element){
        if(isFull()){
            System.out.println("Cannot push into stack which is full"); 
            return false;
        }
        ptr++;
        data[ptr]= element;
        return true;
    }

    // for deleting element from the stack
    public int pop(){
        if(isEmpty()){
            System.out.println(
                "Cannot delete from empty stack"
            );
        }

        int remove= data[ptr];
        ptr--;
        return remove;
    }

    // finding the peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Cannnot find peek from empty array");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr==data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }

public static void main(String[] args) {
    Custom_Stack stack= new Custom_Stack(5);
    stack.push(14);
    stack.push(9);
    stack.push(1);
    stack.push(48);
    System.out.println(stack.pop());
    System.out.println(stack.peek());

    // or 
    Custom_Stack stacks= new  Dynamic_Stack(3);
    stacks.push(7);
    stacks.push(15);
    stacks.push(14);
    stacks.push(9);

    System.out.println(stacks.pop());
    System.out.println(stacks.pop());
    System.out.println(stacks.pop());
    // stacks.pop();
// it will not give an error because if the stack is full we are doubling its size and copying the element in that
}
}