import java.util.Scanner;
public class sortstracs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        String asc="";
        int l= s.length();
        for(char ch= 'a'; ch<='z'; ch++){
            for(int i=0; i<l; i++){
                char c= s.charAt(i);
                if(ch==c){
                    asc=asc+c;
                }
            }

        }
        System.out.print(asc);
    }
    
}
