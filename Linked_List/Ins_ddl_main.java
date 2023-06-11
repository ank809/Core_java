package Linked_List;

public class Ins_ddl_main {
    public static void main(String[] args) {
        Insert_DLL list=new Insert_DLL();
        list.insert(23, 0);
        list.insert(13, 1);
        list.insert(43, 2);
        list.display();
        list.insert(24 , 3);
        System.out.println();
        list.display();
    }
    
}
