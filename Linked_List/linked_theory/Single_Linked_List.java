package linked_theory;

public class Single_Linked_List{
    private Node head;
    private Node tail;
    private int size;
    public Single_Linked_List(){
        this.size=0;
    }
    public void InsertFirst(int value){
        Node node= new Node(value);
        node.next=head;
        if(tail==null){
            tail=head;
        }
        head=node;
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"  ->  ");
            temp=temp.next;
        }
        System.out.print("THE END");
    }
    public void  InsertLast(int value){
        Node node=  new Node(value);
        if(tail==null){
            InsertFirst(value);
            return;
        }
        tail.next=node;
        tail=node;
        size++;;
    }
    public void Insert(int value, int index){
        if(index==0){
            InsertFirst(value);
            return;
        }
        if(index==size){
            InsertLast(value);
            return;
        }
        
        // for inserting at any index
        Node temp= head;
        for(int i=1; i<index; i++){
            temp=temp.next;
        } 
        Node node= new Node(value, temp.next);
        temp.next=node;
        size++;
    }
    // For deleting first element
    public int deleteFirst(){
        head= head.next;
        int val= head.value;
        if(head==null){
            tail=null;
        }
        size-- ;
        return val ;
        
    }
    public Node get(int index){
        Node temp= head;
        for(int i=0; i<index; i++){
            temp=temp.next;
        }
        Node node= temp;
        return node;
    }
    public  int  deleteLast(){
        if(size<=1){
             return deleteFirst();
        }
        Node secondLast= get(size-2);
        int val= tail.value;
        tail=secondLast;
        tail.next=null;
        size --;
        return val;

    }
    // DELETING A PARTICULAR NODE
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev= get(index-1);
        int val= prev.next.value;
        prev.next= prev.next.next;
        return val;
    }
    // returning index of the value
    public boolean  search(int value){  // You can also return node here
        Node node= head;
        while(node!=null){
            if(node.value==value){
                return true; // node
            }
            node=node.next;
        }
        return false; // null 
    }


    public  class Node{
        private int value;
        private Node next;

        private Node(int value){
            this.value=value;
        }
        private Node(int value, Node next){
            this.value=value;
            this.next=next;
        }

        
    }

    
}
