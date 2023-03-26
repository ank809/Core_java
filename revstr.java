import java.util.Scanner;
public class revstr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String a= sc.nextLine();
       int l = a.length();
       System.out.println("length is "+l);
    //    for (int i=0;i<=l-1;i++){
    //     char b= a.charAt(i);
    //     System.out.println(b);
    String rev="";
    for(int i=l-1; i>=0;i--){
        char ch= a.charAt(i);
        rev= (String)rev+ch;
       }
       System.out.print("Reversed string is "+rev);
       
       }

    }
    

