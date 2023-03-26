import java.util.Scanner;
public class vowel3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a string:");
        String s= sc.nextLine();
        int l = s.length();
        int a=0;
        for(int i =0; i<=l-1;i++){
            char ch= s.charAt(i);
            if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                a=i;
                break;
            }

        }
        for( int j=a; j<=l-1;j++){
            System.out.print(s.charAt(j));
        }
        for(int k =0; k<=a-1; k++){
            System.out.print(s.charAt(k));
        }

    }
    
}
