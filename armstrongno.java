import java.util.Scanner;
public class armstrongno {
    public static void main(String[] args) {
        System.out.println("Program to check armstrong no.");
        Scanner sc= new Scanner(System.in);
    System.out.print("Enter the no. you want to check:");
    int a=sc.nextInt();
    int b=a;
    int sum=0;
    while(a!=0){
        int d=a%10;
        sum= sum+d*d*d;
        a=a/10;
    }
    if (sum==b){
        System.out.print("No. is armstrong no.");
    }
    else{
        System.out.print(" No. is not Armstrong no.");
    }    
    
    }
}
