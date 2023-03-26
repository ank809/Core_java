import java.util.Scanner;
public class sortstr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string:");
        String s= sc.nextLine();
        int l = s.length();
        String asc="";
        for(char i='a';i<='z';i++){
            for(int j=0;j<=l-1;j++){
                char ch= s.charAt(j);
                if(ch==i){
                    asc= asc+ ch;
                }
            }
        }
        System.out.println("ascending order is"+asc);
        
    }
    
}
