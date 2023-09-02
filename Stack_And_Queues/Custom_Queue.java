package Stack_And_Queues;

public class Custom_Queue {
    private int data[];
    private int Default_Size=10;
    int end=0;
    Custom_Queue(){
        this.data= new int[Default_Size];
    }
    Custom_Queue(int size){
        this.data= new int[size];
    }

    // to add element in the queue
    public void insert(int element){
        if(isFull()){
            System.out.println("Cannot add more elementts");
        }
        data[end++]=element;
    }

    // to remove the elements
    public int remove(){
        if(isEmpty()){
            System.out.println("Cannot remove from empty queue");
            return -1 ;
        }
        int removed= data[0];
        for(int i=1; i<data.length; i++){
            data[i-1]= data[i];
        }
        end--;
        return removed;
      
    }

    // to get first element
    public int front(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        return data[0];
    }
    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end==0;
    }
    public void display(){
        for(int i=0; i<end; i++){
            System.out.print(data[i]+ " <- ");
        }
          System.out.print("END");
    }
    public static void main(String[] args) {
        Custom_Queue queue= new Custom_Queue(5);
        queue.insert(15);
        queue.insert(5);
        queue.insert(85);
        queue.insert(89);
        queue.insert(11);
        queue.display();
        System.out.println();
       System.out.println(queue.remove());
        queue.display();
    }
    
}
