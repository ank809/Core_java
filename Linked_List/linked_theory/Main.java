package linked_theory;

public class Main {
    public static void main(String[] args) {
        Single_Linked_List list= new Single_Linked_List();
        list.InsertFirst(12);
        list.InsertFirst(10);
        list.InsertFirst(112);
        list.InsertFirst(90);
        list.InsertFirst(89);
        list.InsertFirst(67);
        list.display();
        System.out.println();
        // list.InsertLast(82);
        // list.display();
        // System.out.println();
        list.Insert(25, 4);
        list.display();
       // System.out.println();
        // list.deleteFirst();
        // list.display();
        System.out.println();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println();
        list.delete(3);
        list.display();
        System.out.println();
        System.out.println(list.search(90));
        list.display();


    }
    
}
