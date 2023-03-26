import java.util.Scanner;
public class leetpallin{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string:");
        String s= sc.nextLine();
        s= s.trim();
        s= s.toLowerCase();
        int l= s.length();
        if (s==""){
            System.out.println("true");
        }
        String r="";
        for(int i=0; i<=l-1; i++){
            char ch= s.charAt(i);
            if(ch=='0' || ch=='1' || ch=='2' || ch=='3' || ch=='4' || ch=='5' || ch=='6' ||
            ch=='7' || ch=='8' || ch=='9'){
                r=r+ch;
            }
             for(char j='a' ; j<='z'; j++){
                if(ch==j){
                    r=r+ch;
                }
             }
        }
        System.out.println(r);
        String rev="";
        for(int k=l-1; k>=0; k--){
            char c= s.charAt(k);
            rev= rev+c;
        }
        if (rev==r){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
        

    }
}
