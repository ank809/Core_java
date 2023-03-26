import java.util.Scanner;
public class howareyou {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String s= sc.nextLine();
        s=s.trim();
        s=s+" ";
        String res="";
        int l= s.length();
        for(int i=0; i<l; i++)
        {
            char ch= s.charAt(i);
            int count=0;
            if(ch == ' '){
                for(int j=i-1; j>=0; j--)
                {
                    char c= s.charAt(j);
                    if(c==' '){
                        break;

                    } 
                    else{
                        res=res+c;
                        count++;
                    }
                }
                            if(count!=0){
                        res=res+" ";
                        }
            }
            
             
        }
        System.out.print(res);
    }
    
}
