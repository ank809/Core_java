// Check how many vowels are present in string
import java.util.Scanner;
public class string1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        int l= s.length();
        int count=0;
        for(int i=0; i<l; i++){
            char ch= s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
