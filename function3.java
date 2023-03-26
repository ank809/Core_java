// This is func type no. 3 that is func with no arguments and return type.
import java.util.Scanner;
public class function3{
    public static void main(String[] args) {
        int e= div();
        System.out.print(e);
    }
    static int div(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no.:");
        int a=sc.nextInt();
        System.out.println("Enter second no.:");
        int b=sc.nextInt();
        int d=a/b;
        return d;
    }
}
