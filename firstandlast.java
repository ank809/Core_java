import java.util.Arrays;
import java.util.Scanner;
public class firstandlast {
    public static void main(String[] args) {
        int [] arr= {2,3, 16, 16, 16, 16, 18};
        int target= 16;
       int []ans={-1,-1};
       ans[0]= searchrange(arr, target, true);
        if(ans[0]!=-1){
            ans[1]= searchrange(arr, target, false);
        }
        System.out.print(Arrays.toString(ans));

    }
    static int searchrange(int []arr, int target, boolean value){
        int ans = -1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end= mid-1;
            }
            else{
                ans = mid;
                if(value){
                    end= mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    

}
