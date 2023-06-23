package linked_theory;

public class Doubly_LL {
    private Node head;
    private Node tail;
    private int size;

    public Doubly_LL(){
        this.size=0;
    }

    public void InsertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }

    // Inserting at last

  public void InsertLast(int val) {
  Node node = new Node(val);
  Node temp = head;
  while (temp.next != null) {
    temp= temp.next;
  }
 temp.next = node;
  node.prev = temp;
} 

// Inserting at any index

    public void insert(int value, int index){
        
        Node temp=head;
        Node node= new Node(value);
        for(int i=1; i<index; i++){
            temp=temp.next;
        }
        node.next=temp.next;
        node.prev=temp;
        temp.next=node;
        node.next=temp.next.next;

        if(index==0){
            InsertFirst(value);
        }
        if(index==size-1){
            InsertLast(value);
        }
        

    }

    // For inserting at after a particular node

    public void insertAfter(int value, int  after){
        Node aftr= get(after);
        if(aftr==null){
            System.out.println("does not exist");
        }
         Node node= new Node(value);
        aftr.next=node.next;
        node.next=aftr;
        aftr.prev=node;
        if(aftr.next!=null){
        aftr.next.prev= aftr;
        }
    }

    public Node get(int val){
        Node node= head;
        while(node!=null){
            if(node.value==val){
                return node;
            }
            node=node.next;
        }
        return null;

    }

    public void display(){
        Node node= head;
        Node last= null;
        while(node!=null){
            System.out.print(node.value+" -> ");
             last=node;
            node=node.next;
        }
        System.out.println("THE END");
        System.out.println("Print in reverse :");
        while(last!=null){
            System.out.print(last.value + " -> ");
            last=last.prev;
        } 
        System.out.println(); 
    }

    private class Node{
         int value;
         Node next;
         Node prev;

        public Node(int value){
            this.value=value;
        }

        public Node (int value, Node next, Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }

    }
    
}
