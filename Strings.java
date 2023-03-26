//THis program user gives string as input and you have to print all the 
//character in vertical order
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter your name");
        String s = sc.nextLine();
        int l = s.length();
        System.out.println(l);
        for(int i=0; i<=l-1;i++){
            char c= s.charAt(i);
            System.out.println(c);
        }
    }
    
}
