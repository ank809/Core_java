import java.util.Arrays;
import java.util.Scanner;
public class queslee1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the target element");
        int target= sc.nextInt();
        
        int arr1[] = result(arr, target);
        System.out.println(Arrays.toString(arr1));
    }
    static int[] result (int[] arr, int target)
    {
        int[] ans= {-1, -1};
        ans[0]= search(arr, target, true);
        if(ans[0]!=-1){
            ans[1]= search(arr, target, false);
        }
        return ans;
    }
    static int search ( int[] arr , int target , boolean firstindex){
        int start=0;
        int ans= -1;
        int end= arr.length-1;
        
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target>arr[mid]){
                start= mid+1;
            }
            else if(target<arr[mid]){
                end= mid-1;
            }

            else{
                ans= mid;
                if(firstindex){
                    end= mid-1;
                }
                else{
                    start= mid+1;
                }
            }
        }
        return ans;
    }
    
    
}
