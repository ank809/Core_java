import java.util.ArrayList;
public class Access_main {
    public static void main(String[] args) {
        Access obj= new Access(34, "Ankita");
       // System.out.println(obj.num); // if num is private you cannot access it

        // need to do few things
        // 1. access the data members
        // modify the data members
        // ArrayList<Integer> list= new ArrayList<>();
        //list.DEFAULT_CAPACITY;   // cannot access this as it is private .. BUT can be accessed using  Constructor

        System.out.println(obj.getNum());   // by using getter and setter you can access the value of private datatypes
       
    }
    
}
