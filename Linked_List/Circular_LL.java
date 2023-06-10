package Linked_List;
public class Circular_LL {
    
    private Node head;
    private Node tail;


    // For inserting after tail

    public void Insertaftertail(int value){
        Node node= new Node(value);
        if(head==null){
            head=node;
            tail=node;
        }
        if(tail!=null){
        tail.next=node;
        }
        node.next=head;
        tail=node;
        
    }
     // For displaying

     public void display(){
        Node temp=head;
       if(head!=null){
        do{
            System.out.print(temp.value+" ->");
            temp=temp.next;
        } while(temp!=head);
       }
        System.out.println("HEAD");
     }
     // For deleting element
     public void delete(int val){
        Node node= head;
        if(node==null){
            return;
        }
        if(node.value==val){
            tail.next=head.next;
            head=head.next;  
        }
        do{
            Node n = node.next;
            if(n.value==val){
                node.next=n.next;
                break;
            }
            node=node.next;
        } while(node!=head);
        if(node==head){
            System.out.println("does not exist");
            
        }
     }


    private class Node{
         int value;
         Node next;

         public Node(int value){
            this.value=value;
         }
         public Node(int value, Node next){
            this.value=value;
            this.next=next;
         }
    }
    
}
