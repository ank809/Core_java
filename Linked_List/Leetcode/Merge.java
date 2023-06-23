package Leetcode;

public class Merge {
    Node head;
    Node tail;
    int size;

    public Merge() {
        this.size = 0;
        this.tail = null; // Initialize tail to null
    }

    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // public void insertFirst(int val) {
    //     Node node = new Node(val);
    //     node.next = head;
    //     if (tail == null) {
    //         tail = head;
    //     }
    //     head = node;
    //     size++;
    // }
    public void insertFirst(int val) {
    Node node = new Node(val);
    node.next = head;
    if (tail == null) {
        tail = node; // Update tail to the new node
    }
    head = node;
    size++;
}

   public void  insertLast(int value){
        Node node=  new Node(value);
        if(tail==null){
            insertFirst(value);
            return;
        }
        tail.next=node;
        tail=node;
        size++;;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.print("The End");
        System.out.println();
    }

    public static Merge merge(Merge first, Merge second) {
        Merge ans = new Merge();
        Node f = first.head;
        Node s = second.head;
        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            }
            else if(f.value > s.value){
                ans.insertLast(s.value);
                s = s.next;
            }
            else{
                ans.insertLast(f.value);
                f=f.next;
            } 
            
        }
        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        Merge list1 = new Merge();
        Merge list2 = new Merge();
       list1.insertLast(1);
       list1.insertLast(3);
       list1.insertLast(5);
        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(9);
        list2.insertLast(14);
        Merge ans = Merge.merge(list1, list2);
        ans.display();
    }
}