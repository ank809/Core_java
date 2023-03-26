import java.util.Scanner;
public class vowel1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        String s= sc.nextLine();
        int l = s.length();
        for(int i =0; i<=l-1; i++){
            char ch= s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                System.out.print(ch);
                break;
            }
        }
}
}