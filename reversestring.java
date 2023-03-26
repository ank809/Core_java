import java.util.*;
public class reversestring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.nextLine();
        int l =a.length();
        String rev= " ";
        for(int i=l-1; i>=0; i--){
            char c = a.charAt(i);
            rev=(String)rev+c;
        }
        System.out.println(rev);
    }
}
