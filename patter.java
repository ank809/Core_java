import java.util.Scanner;
public class patter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        for(int i=0; i<=x; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=x; i>=0; i--){
            for(int j=i; j>=0; j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
}
