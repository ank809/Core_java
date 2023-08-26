public class CircularLL {
    private class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    private Node head;
    private Node tail;
    
    public void Insert(int val){
        Node node= new Node(val);
        if(head==null){
            head=node;
            tail=node;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void display(){
        Node temp= head;
        do{
            System.out.print(temp.val+"-> ");
            temp=temp.next;
        }while(temp!=head);
    }

    public void delete(int val){
        Node temp=head;
        if(temp.val==val){
            head=head.next;
            tail.next=head;
            return;
        }
      do{
        Node n= temp.next;
        if(n.val==val){
            temp.next=n.next;
            break;
        }
        temp=temp.next;
      }while(temp!=head);
    }
    public static void main(String[] args) {
        CircularLL list= new CircularLL();
        list.Insert(12);
        list.Insert(45);
        list.Insert(82);
        list.display();
        list.delete(45);
        list.display();
    }
    
}
