import java.util.Scanner;
public class ankita {
    public static void main(String[] args) {
        
    Scanner sc= new Scanner (System.in);
    System.out.println("enter a string");
    String s= sc.nextLine();
    int l= s.length();
    String sort= "" ;
    for(char i='a'; i<='z'; i++){
        for(int j=0; j<=l-1;  j++){
            char ch= s.charAt(j);
        
        if (ch==i){
            sort= sort+ch;
        }
    }
        
    }
    System.out.println(sort);
     for (char c='a'; c<='z'; c++){
        int count=0;
        for(int k=0; k<=l-1; k++){
            char ab= sort.charAt(k);
            
        
         if (c==ab){
            count+=1;
         }
        }
     
      if (count==0){
        continue;
      }
      else{
        System.out.println(c+"-->"+ count);
      }
    }
}
    
}
