package linked_theory;
public class Rev_Linked {

        private Node head;
        private Node tail;
        private int size;

        public Rev_Linked(){
            this.size=0;
        }

        // For inserting at first
        public void InsertFirst(int value){
            Node  node= new Node(value);
            node.next=head;
            if(tail==null){
                tail=head;
            }
            head=node;
            size++;
        }
        // For inserting at last

        public void InsertLast(int value){
            Node node= new Node(value);
            tail.next=node;
            if(tail==null){
                InsertFirst(value);
            }
            tail=node;
            size++;

        }
        // For inserting at a particular index
        public void Insert(int value, int index){
            Node node= new Node(value);
            Node temp= head;
            for(int i=1; i<index; i++){
                temp=temp.next;
            }
            node.next= temp.next;
            temp.next=node;
            size++;
            if(index==0){
                InsertFirst( value);
            }
            if(index==size){
                InsertLast(value);
            }
            size++;
        }
        
        // For deleting first element

        public int deleteFirst(){
            int val= head.value;
            head=head.next;
            if(head==null){
                tail=null;
            }
              size--;
            return val;
          

        }

        // For deleting last

        // For displaying 
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.value + " -> ");
                temp=temp.next;
            }
            System.out.print("THE END ");
        }
        public int deleteLast(){
            if(size<=1){
                return deleteFirst();
            }
            Node secondLast= get(size-2);
            int val= tail.value;
            tail=secondLast;
            tail.next=null;
            size--;
            return val;
        }
        public Node get(int index){
        Node node=head;
            for(int i=1; i<index; i++){
                node=node.next;
            }
            return node;
        // Node temp=node;
        // return temp;
        }

        // Deleting a particular index

        public int delete(int index){
            Node temp=head;
            if(index==0){
                deleteFirst();
            }
            if(index==size-1){
                deleteLast();
            }
            for(int i=0; i<index; i++){
                temp=temp.next;
            }
            int val=temp.next.value;
            temp.next=temp.next.next;
            size--;
            return val;

        }
        // For searching


        public boolean search(int val){
            Node node= head;
            for(int i=0; i<size; i++){
                if(node.value==val){
                    return true;
                } 
                node=node.next;
            }
              return false;
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
    
}
