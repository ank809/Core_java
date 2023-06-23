package linked_theory;

public class Insert_DLL {

   private  Node head;
   private  Node tail;
   private int size;
   public void Insert_DLL(){
    this.size=0;
   }

    public class Node{
        int value;
        Node next;
        Node prev;

        public  Node(int value){
            this.value=value;
        }

        public Node(int value, Node next, Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }

        // iserting at any  index

        public void insert(int val, int index){
          Node node= new Node(val);
          Node temp=head;
          if(index>0 && index<size){

            for(int i=0; i<index; i++){
            temp=temp.next;
            }
            node.next=temp.next;
            node.prev=temp;
            temp.next=node;
            temp.next.prev=node;
        }
           if(index==0){
           inserfirst(val);
          }

          if(index==size-1){
           insertLast(val);
          }

        }

        public void inserfirst(int val){
                Node node= new Node(val);
                if(head!=null){
                   head.prev=node;
                }

                node.next=head;
                node.prev=null;
                head=node;
        }
   public void insertLast(int val) {
  Node node = new Node(val);
  Node temp = head;
  while (temp.next != null) {
    temp= temp.next;
  }
 temp.next = node;
  node.prev = temp;
} 
        

        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.value +" -> ");
                temp=temp.next;
            }
            System.out.println("End");
        }
    }
    
