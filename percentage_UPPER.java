import java.util.Scanner;
public class percentage_UPPER {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a string");
        String s= sc.nextLine();
        int l= s.length();
        int lower=0;
        int upper=0;
        int special=0;
        for(int i=0; i<=l-1; i++){
            char ch= s.charAt(i);
            int c= (int)ch;
            if(c>=97 && c<=122){
                lower++;
            }
            else if(c>=65 && c<=90){
                upper++;
            }
            else{
                special++;
            }
        }

        double per= (double)(lower*100)/l;
        double per2= (double)(upper*100)/l;
        double per3=(double)(special*100)/l;
        System.out.println("Percentage is "+ per+"%");
        System.out.println("Percentage is "+ per2+ "%");
        System.out.println("Percentage is "+ per3+ "%");
    }
    
}
