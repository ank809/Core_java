import java.util.Scanner;
public class space {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String s= sc.nextLine();
        int l= s.length();
        for (int i=0; i<=l-1; i++){
            char ch = s.charAt(i);
            if(ch==' '){
                continue;
            }
            System.out.print(ch);
        }
    }
    
}
