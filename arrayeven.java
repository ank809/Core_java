import java.util.Scanner;
public class arrayeven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n= sc.nextInt();
        int arr[]= new int[n];
        int count1=0;
        int count2=0;
        for(int j=0; j<n; j++){
            arr[j]= sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                count1++;
            }
            else{
                count2++;
            }
        }
        System.out.println("count of even number is "+count1);
        System.out.print("count of odd number is "+count2);

    }
    
}
