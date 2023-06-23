package linked_theory;

public class Rev_main {
    public static void main(String[] args) {
        Rev_Linked list= new Rev_Linked();
        list.InsertFirst(90);
        list.InsertFirst(50);
        list.InsertFirst(35);
        list.InsertFirst(66);
        list.InsertLast(12);
        list.display(); 
        System.out.println(); 
        list.Insert(54, 3);
        list.display();
        System.out.println();
        list.deleteFirst();
        list.display();
        System.out.println();
        System.out.println( list.deleteLast());
       
        list.display();
        System.out.println();
        list.delete(0);
        list.display();
        System.out.println();
       System.out.println(list.search(54));
    }
    
}
