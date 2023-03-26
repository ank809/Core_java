// Function with arguments and return type
import java.util.Scanner;
public class function4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first no.");
        int a= sc.nextInt();
        System.out.println("Enter second no.");
        int b= sc.nextInt(); 
        int d= sum(b, a);
        System.out.println(d);
    }
    static int sum(int c,int d){
        int e= c+d;
        return e;
    }
}
