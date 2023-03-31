import java.util.Scanner;
public class londonstr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string");
        String s= sc.next();
        String newstr="";
        int l= s.length();
        int a=0;
        for(int i=0; i<l; i++){
            char ch= s.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
             a =i;
                break;
            }
        }
        for(int j=a; j<l; j++){
            char ch= s.charAt(j);
            newstr= newstr+ch;
        }
        for(int k=0; k<a; k++){
            char ch= s.charAt(k);
            newstr= newstr+ch;
        }
        System.out.print(newstr);
    }
    
}
