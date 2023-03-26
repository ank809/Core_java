import java.util.Scanner;
public class lenlastwrd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string:");
        String s= sc.nextLine();
        s=s.trim();
        int count=0;
        int l= s.length();
        for(int i=l-1; i>=0; i--){
            char ch= s.charAt(i);
            if(ch!=' '){
                count++;
            }
            else{
                break;
            }
        }
        System.out.print("Lenght is"+ count);
    }
    
}
