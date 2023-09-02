package Stack_And_Queues;

public class Dynamic_Stack extends Custom_Stack {
    Dynamic_Stack(){
        super();
    }
    Dynamic_Stack(int size){
        super(size);
    }

    // all the functions will remain same but the only thing we have to work on is push
    @Override
    public boolean push(int element){
        if(isFull()){
            int [] temp= new int[data.length*2];
            for(int i=0; i<data.length; i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(element);
    }
    public int pop(){
        return super.pop();
    }
    public static void main(String[] args) {
        Dynamic_Stack stack= new Dynamic_Stack(2);
        stack.push(90);
        stack.push(11);
        stack.push(1);
        System.out.println(stack.pop());
    }
}
