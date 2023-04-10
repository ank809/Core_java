import java.util.Scanner;
public class stringpalindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the string");
        String s= sc.next();
        String orig = s;
        int l= s.length();
        String rev="";
        for(int i= l-1; i>=0; i--){
            char ch= s.charAt(i);
            rev= rev+ch;
        }
        if(rev.equals(orig) ){
           System.out.println("yes it is palindrome");

        }
        else{
            System.out.print("Oops no its not");
        }
    }
    
}
