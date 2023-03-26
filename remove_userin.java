import java.util.Scanner;
public class remove_userin {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        int l= s.length();
        System.out.println("Enter the character you want to remove:");
        char d= sc.next().charAt(0);
        for(int i=0; i<=l-1; i++){
            char a= s.charAt(i);
            if(a==d){
                continue;
            }
            else{
                System.out.print(a);
            }
        }
    }
    
}
