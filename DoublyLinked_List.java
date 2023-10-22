public class DoublyLinked_List {
    public class  Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val=val;
        }
        Node(int val, Node next){
            this.val=val;
            this.next=next;
        }
        Node(int val, Node next, Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }

    private Node head;
    int size;
    DoublyLinked_List(){
        this.size=0;
    }
    // For inserting at first index
    public void InsertFirst(int val){
        Node node= new Node(val);
       node.next=head;
       node.prev=null;
       if(head!=null){
        head.prev=node;
       }
       head=node;

    }
    Node last=null;
    public void display(){
        Node node= head;
        while(node!=null){
            System.out.print(node.val+" "+" -> ");
            last=node;
            node=node.next;
        }
        System.out.println("End");
    }
    public void displayReverse(){
        while(last!=null){
            System.out.print(last.val+" "+" -> ");
            last=last.prev;
        }
        System.out.println("End");
    }
    public void InsertLast(int val){
        Node temp=head;
        Node node=new Node(val);
        while(temp.next!=null){
            temp=temp.next;
        }
        node.next=null;
        if(head==null){
           node.prev=null;
           head=node;

           return;
        }
        node.prev=temp;
        temp.next=node;
    }
    // Insert after a particular node
    public void InsertAfterr(int after, int val){
        Node p= find(after);
        if(p==null){
            System.out.println("node not exist");
            return;
        }
        Node node=  new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;
        }
    }

    // for finding the node
    public Node find(int after){
        Node temp=head;
        while(temp!=null){
            if(temp.val==after){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }


    public static void main(String[] args) {
        DoublyLinked_List list= new DoublyLinked_List();
        list.InsertFirst(12);
        list.InsertFirst(78);
        list.InsertFirst(1);
        list.InsertFirst(34);
        list.InsertFirst(23);
        list.display();
        list.displayReverse();
        list.InsertLast(87);
        list.display();
        list.InsertAfterr(1, 65);
        list.display();
        list.InsertAfterr(87, 0);
        list.display();
    }
}
