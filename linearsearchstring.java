import java.util.Scanner;
public class linearsearchstring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        String s= sc.nextLine();
        System.out.println("Enter the character you want to search:");
        char ch= sc.next() ;
        int l= s.length();
        int count=0;
        for(int i=0; i<l; i++){
            char c= s.charAt(i);
            if(ch==c){
                count++;
            }
            
        }
        if(count!=0){
            System.out.println("found"+count+ch);
        }
    }
    
}
