import java.util.Scanner;
public class ques24 {
   public static void main(String[] args) {
    System.out.println("THis is dsa bootcamp ques24");
    Scanner sc=new Scanner(System.in);
    int sum=0;
    while(true){
        int b= sc.nextInt();
        sum =sum+b;
        if(b==0){
            break;
        }
    }
    System.out.print("The sum is"+sum);


   } 
}
