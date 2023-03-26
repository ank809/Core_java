// 145 = 1!+ 4!+ 5!
import java.util.Scanner;
public class specialno {
  public static void main(String[] args) {
    System.out.println(" Special number");
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the no. that you want to check is special or not");
    int a= sc.nextInt();
    int n= a;
    int sum =0;
    while(a!=0){
      int d = a%10;
      int f =1;
      for(int i =1; i<=d;i++){
          f = f*i;
      }
      sum = sum+f;
      a/=10;
  
    }
    if (sum==n){
      System.out.println("special number");
    }
    else{
      System.out.println("not special no.");
    }

  }  
}
