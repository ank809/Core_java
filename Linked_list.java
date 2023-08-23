

public class Linked_list {

        private class Node{
            int val;
            Node next;
            
           private Node(int value){
                this.val=value;
            }
            private Node(int value, Node next){
                this.val= value;
                this.next= next;
            }
        }
        private Node head;
        private Node tail;
        int size;
        Linked_list(){
          this.size=0;
        }
    
        public void InserIndex(int val, int index){
          if(index==0){
            InsertFirst(val);
            return;
          }
          if(index==size){
            InsertLast(val);
            return;
          }
          Node temp= head;
          for(int i=1; i<index; i++){
            temp=temp.next;
          }
          Node node = new Node(val, temp.next);
          temp.next= node;
          size++;
        }
      public   void InsertFirst(int value){
        Node node= new Node(value);
        node.next= head;
        if(tail==null){
            tail=head;
        }
        
        head=node;
        size++;
      }
      public void InsertLast(int val){
        if(tail==null){
          InsertFirst(val);
          return;
        }
        Node node= new Node(val);
        tail.next=node;
        tail=node;
        size++;
      }

      // For deleting the first value and also returning that
      public int deleteFirst(){
          int val= head.val;
          head= head.next;
          // if we only has one element in the list
          if(head==null){
            tail=null;
          }

          size--;
          return val;
      }
      

      // delete the last element

      public int deleteLast(){
        int val=tail.val;
        Node temp=head;
        if(size<=1){
          deleteFirst();
        }
        for(int i=1; i<=size-2; i++){
          temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        size--;
        return val;
      }

      // deleting at a particular index

      public int deleteIndex(int index){
        if(index==0){
          return deleteFirst();
        }
        if(index==size-1){
          return deleteLast();
        }
        Node temp=head;
        for(int i=1; i<index; i++){
          temp=temp.next;
        }
        int value=temp.next.val;
        temp.next=temp.next.next;
        size--;
        return value;
      }

      public Node findValue(int value){
        Node temp=head;
        while(temp!=null){
          if(temp.val==value){
            return temp;
          }
          temp=temp.next;
        }
        return null;
      }
      public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"  ->  ");
            temp=temp.next;
        }
        System.out.print("THE END");
    }
      public static void main(String[] args) {
        Linked_list list= new Linked_list();
        list.InsertFirst(12);
        list.InsertFirst(25);
        list.InsertFirst(89);
        list.InsertFirst(7);
        list.InsertLast(3);
        list.InserIndex(111, 5);
        // list.display();
        System.out.println();
        System.out.println(list.deleteFirst());
        System.out.println();
        list.display();
        System.out.println();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteIndex(3));
      list.display();
      System.out.println();
      System.out.println(list.findValue(10));
      
      }

}
