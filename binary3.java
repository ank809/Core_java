import java.util.Arrays;
import java.util.Scanner;
public class binary3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n= sc. nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print(Arrays.toString(arr));
        System.out.println("Enter te target element:");
        int target= sc.nextInt();
        int start = 0;
        int end= arr.length-1;
        int count=0;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target>arr[mid]){
                start= mid+1;
            }
            else if (target <arr[mid]){
                end= mid-1;
            }
            else{
                System.out.println("Target element found");
            }

        }
       
    }
    
}
