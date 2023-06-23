package Leetcode;

class Remove_Duplicates{
    Node  head;
    Node tail;
    int size;
    void Remove_Duplicates(){
        this.size=0;
    }

   public class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value= value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }

    public void insertFirst(int val){
        Node node= new Node(val);
        node.next=head;
        if(tail==null){
            tail=head;
        }
        head= node;
        size++;
    }

    public void InsertLast(int val){
        Node node= new Node(val);
        tail.next=node;
        if(tail==null){
            insertFirst(val);   
        }
        tail=node;
        size++;
    }

    public void display(){
        Node node=head;
        while(node!=null){
            System.out.print(node.value +" -> ");
        
             node=node.next;
        }
            System.out.print("The End");
        size++;
    }

    public void duplicates(){
        Node node=head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
            }
            else{
                node=node.next;
            }
            size--;
        }
    }


public static void main(String[] args) {
    Remove_Duplicates list= new Remove_Duplicates();
    list.insertFirst(1);
    list.insertFirst(1);
    list.insertFirst(2);
    list.insertFirst(2);
    list.insertFirst(3);
    list.InsertLast(4);
    list.display();
    list.duplicates();
    System.out.println();
    list.display();
}
}
