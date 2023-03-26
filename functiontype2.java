import java.util.*;
public class functiontype2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("this is function type 2 that is with arguments:");
        System.out.println("Enter first number you want :");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int z=sub(a,b);
            System.out.print(z);
    }
    static int  sub(int x,int y){
      int z=y-x;

     return z;
    }
}
