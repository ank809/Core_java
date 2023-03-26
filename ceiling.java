import java.util.Scanner;
public class ceiling {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= {2,3,5,7,8,14,16,19};
        int target= 15;
        int ans= ceiling(arr,target);
        System.out.println(ans);

    }
    static int ceiling(int []arr, int target){
            if(target>arr[arr.length-1]){
                return -1;
            }
            int start= 0;
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
                    return mid;
                }
            }
            return arr[start];
    }
    
    
}
