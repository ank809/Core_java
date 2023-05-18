import java.util.Scanner;
public class mul {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int x=sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%x!=0){
                sum=sum+i;
            }
        
        }
        System.out.println(sum);
    }
    
}
