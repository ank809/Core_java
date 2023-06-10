package Linked_List;

public class Main_C {
    public static void main(String[] args) {
        Circular_LL list= new Circular_LL();
        list.Insertaftertail(89);
        list.Insertaftertail(00);
        list.Insertaftertail(65);
        list.Insertaftertail(79);
        list.Insertaftertail(23);
        list.display();
        System.out.println();
        list.delete(89);
        list.display();
    }
    
}
