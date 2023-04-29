import java.util.Arrays;
public class quicksort2 {
    public static void main(String[] args) {
        int [] arr={2, 3, 8, 5, 9};
        sorting (arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sorting(int [] arr, int left, int right){
        if(left>right){
            return ;
        }
        int start= left;
        int end= right;
        int mid= start+(end-start)/2;
        while(start<=end){
            while(arr[start]<arr[mid]){
                start++;
            }
            while(arr[end]>arr[mid]){
                end--;
            }
            if(start <=end){
                int temp=arr[start];
                arr[start]= arr[end];
                arr[end]= temp;
                start++;
                end--; 
            }
        }
       
        sorting(arr, left, end);
         sorting(arr, start, right);
    }
    
}
