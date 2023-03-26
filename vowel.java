import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
      Scanner sc= new Scanner (System.in);
      System.out.println("Enter the name or string");
      String s= sc.nextLine();
      int l= s.length();
      int  count =0;
      for(int i=0; i<=l-1;i++){
        char ch= s.charAt(i);
        
        if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            count= count+1;
        }
        //System.out.print("count is "+count);

        
      }
      System.out.print("count is "+ count);


    }
    
}
