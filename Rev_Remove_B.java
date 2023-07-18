import java.util.Scanner;

public class Rev_Remove_B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your string");
        String s= sc.next();
        String rev="";
        int len=s.length();
        for(int i=len-1; i>=0; i--){
            char ch=s.charAt(i);
            if(ch=='B' || ch=='b'){
                continue;
            }
            else{
                rev=rev+ch;
            }

        }
        System.out.println(rev);
    }
    
}
