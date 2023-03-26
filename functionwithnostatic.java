import java.util.*;
public class functionwithnostatic {
    public static void main(String[] args) {
        System.out.println("Enter two nos:");
        Scanner sc= new Scanner(System.in);
        functionwithnostatic f1= new functionwithnostatic();
// Here we have to write class name to make class object
//        here f1 is class object
        int a=sc.nextInt();
        int b=sc.nextInt();
        int value=f1.sum(a,b);
        System.out.println(value);
    }
    int sum(int a, int b){
        int z=a+b;
        return z;
    }
}












            