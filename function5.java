// multiplication of two numbers in java using functions with arguments
import java.util.Scanner;
public class function5 {
    public static void main(String[] args) {
       function5 f1= new function5(); 
    
    Scanner sc= new Scanner (System.in);
    System.out.println("enter first number:");
    int a =sc.nextInt();
    System.out.println("enter second number:");
    int b= sc.nextInt();
    //int value= multiplication(a,b);
    System.out.println("multiplication is"+ multiplication(a,b));
}
static int multiplication(int a,int b){
    int mul= a*b;
    return mul;

}
}
