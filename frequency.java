import java.util.Scanner;
public class frequency {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a string:");
        String s= sc.nextLine();
        int l= s.length();
        String res="";
        // for sorting
        for(char i='a'; i<='z';i++){
            for(int j=0;j<=l-1;j++){
                char ch= s.charAt(j);
                if(ch==i){
                    res= res+ch;
                }
             }
        }
        System.out.println("sorted string is "+res);
         // for frequency
         for(char b= 'a'; b<='z';b++){
            int count=0; // to refresh the value of count
            for(int k=0;k<=l-1;k++){
                if(b== res.charAt(k)){
                    count++;
                }
            }
            if(count==0){
                continue;
            }
            else{
                System.out.println(b +"--" + count);
            }
         }

    }
    
}
