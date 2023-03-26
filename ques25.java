import java.util.Scanner;


public class ques25 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("this is ques 25 in java dsa bootcamp");
    System.out.println("Enter the number you want to check:");
    int variable=0;
    while(true){
        int a=sc.nextInt();
        // variable=variable+a;
        if(a==0){
            break;
            
        }
        if(a<variable){
            variable=a;
        }
        

    }  System.out.println(variable);
 }

}
