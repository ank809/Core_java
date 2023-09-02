package Stack_And_Queues;


public class Circular_Queue {
        private int data[];
        private int Default_Size=10;
        int end=0;
        int first=0;
        int size=0;
        Circular_Queue (){
            this.data= new int[Default_Size];
        }
        Circular_Queue (int size){
            this.data= new int[size];
        }
    
    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size==0;
    }

    // to add element in the queue
    public void insert(int element){
        if(isFull()){
            System.out.println("Cannot add more elementts");
        }
        data[end++]=element;
        end=end%data.length;
        size++;
    }
    // to remove the elements
    public int remove(){
        if(isEmpty()){
            System.out.println("Cannot remove from empty queue");
            return -1 ;
        }
        int removed= data[first++];
        first= first%data.length;
        size--;
        
        return removed;
      
    }

    public int front(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        return data[first];
    }

    // for displaying
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int i=first;
        do{
            System.out.print(data[i]+"<-");
            i++;
            i%=data.length; 
        }while(i!=end);
        System.out.println("END");
    }
    public static void main(String[] args) {
        Circular_Queue queue= new Circular_Queue(5);
        queue.insert(15);
        queue.insert(5);
        queue.insert(85);
        queue.insert(89);
        queue.insert(11);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(133);
        System.out.println();
        queue.display();
    }
}
