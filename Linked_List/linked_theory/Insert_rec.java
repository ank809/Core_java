package linked_theory;

public class Insert_rec {
     
    public  Node head;

    public class Node
    {
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
    Node current =head;
    public void ins_rec(int index, int value, Node current){
        Node node= new Node(value);
         if(index==0){
            node.next=current.next;
            current.next=node;
         }

         ins_rec(index-1, value, current.next);
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"  ->  ");
            temp=temp.next;
        }
        System.out.print("THE END");
    }
    
}
