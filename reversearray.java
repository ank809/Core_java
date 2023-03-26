import java.util.Scanner;
public class reversearray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enterr the size of array ");
        int n= sc.nextInt();
        String arr[]= new String [n];
         String rev[]= new String[n];
        sc.nextLine();
        for(int i=0; i<n; i++){
            arr[i]= sc.nextLine();
        }
        for(int j=0; j<n; j++){
            System.out.println(arr[j]);
        }
        
        
        for(int k=n; k<0; k++){
            rev = rev + arr[k];

        }
         System.out.println(rev);
    }
    
}
