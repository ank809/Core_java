import java.util.*;
public class menudriven {
   int x;
   boolean n;

    menudriven(int a, boolean b)//parametrized constructor
    // menudriven() --> default constructor
    {
        x=a;
        n=b;
    }

   void accept(){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the value of x:");
    x=sc.nextInt();
   }
   void is_palindrome() {
       int a = x;
       int rev = 0;
       while (a != 0) {
           int d = a%10;
           rev = rev * 10 +d;
           a = a / 10;
       }
       if (rev == x) {
           n = true;
       } else {
           n = false;
       }
   }
    void display(){
        System.out.println(x);
        System.out.println(n);
    }

   public static void main(String[] args) {


    menudriven m1 = new menudriven(123, false);

      m1.accept();
      m1.is_palindrome();
       m1.display();
   }
    
}
