import java.util.*;
public class menudriven1 {
    int z ;
    int x;
    int y;
    boolean val;
    int orig;
    void accept(){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the value of x:");
        x= sc.nextInt();
        System.out.println("Enter the value of y:");
        y=sc.nextInt();

    }
    void sum(){
        z=x+y;
    }
    void is_special(){
        System.out.println("The number which we want to check is special or not:"+z);
        // 143= 1!+4!+ 5!
         orig = z;
        int sum=0;
        while(z!=0){
            int d = z%10;
            int f=1;
            for(int i =1; i<=d;i++){
                    f= f*i;
            }
            sum=sum+f;
            z/=10;
        }
        if (sum==orig){
          val = true;
        }
        else{
           val=false;
        }

        
    }
    void display(){
        System.out.println(orig);
        System.out.println("The number is special"+val);
    }
    public static void main(String[] args) {
        menudriven1 m1=  new menudriven1();
        m1.accept();
         m1.sum();
         m1.is_special();
        m1.display();
    }
}
