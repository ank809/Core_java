import java.util.*;
public class helloworld extends functionwithnostatic{
    public static void main(String[] args){
        // Scanner sc =new Scanner(System.in);   
        //  here sc is object
        System.out.println("hello world");
        // int x =sc.nextInt();
        // x=x+5;
        // System.out.println(x);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        functionwithnostatic fun = new functionwithnostatic();
        System.out.println(fun.sum(a, b));
       String y= "hello world";
         int z= y.length();
         System.out.println("length of sting is:"+z);

    }
}