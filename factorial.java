import java.util.Scanner;
public class factorial {
 public static void main(String[] args) {
    System.out.println("Factorial of a number");
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no. whose factorial you want to check ");
    int a =sc.nextInt();
    for( int i=1;i<a;i++){
        System.out.print(i);
        if(i<a){
            System.out.print("*");
        }
    }
 }   
}
