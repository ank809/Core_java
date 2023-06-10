package Linked_List;

public class Main_Doubly {
    public static void main(String[] args) {
    Doubly_LL list= new Doubly_LL();
    list.InsertFirst(2);
    list.InsertFirst(90);
    list.InsertFirst(13);
    list.InsertFirst(43);
    list.InsertFirst(67);
    list.display();
    System.out.println();
    list.InsertLast(87);
    list.display();
    System.out.println();
    list.insert(21, 2);
    list.display();
    System.out.println();
    list.insertAfter(78, 90);
    list.display();

    }
}
