import java.util.*;
public class binary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print(Arrays.toString(arr));
        int target= 6;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(target< arr[mid]){
                end= mid-1;
            }
            else if(target> arr[mid]){
                start= mid+1;
            }
            else{
                System.out.println("found");
                break;
            }
        }
        
    }
    
}
