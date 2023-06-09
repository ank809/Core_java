package Linked_List;

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
