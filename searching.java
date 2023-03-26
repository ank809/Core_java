import java.util.Scanner;
public class searching {
    public static void main(String[] args) {
        System.out.println("enter the size of string:");
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the number you want to search");
        int m= sc.nextInt();
        int count =0;
        for(int j=0; j<n; j++){
            if(arr[j]==m){
                count++;
                break;
            }
        }
        if(count!=0){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
    
}
