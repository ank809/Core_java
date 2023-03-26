import java.util.Arrays;
import java.util.Scanner;
public class binary2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
       System.out.println("Enter the target element:");
       int target= sc.nextInt();
       int start=0;
       int end= arr.length-1;
       while(start<=end){
        int mid= start+(end=start)/2;
        if(target>arr[mid]){
            start= mid+1;
        }
        else if(target<arr[mid]){
            end= mid-1;
        }
        else{
            System.out.println("Target found");
        }
       }

    }
    
}
