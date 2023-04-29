import java.util.Arrays;

public class Quicksort1 {
    public static void main(String[] args) {
        int [] arr= {2,4,6,7,83,243,54,45};
        sort(arr, 0, arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
    static void  sort(int [] arr, int low , int high){
        if(low >= high)
        {
            return;
        }
        int start= low;
        int end= high;
        int pivot= start+(end-start)/2;
        while(start<=end){
            while(arr[start]<arr[pivot]){
                start++;
            }
            while(arr[end]>arr[pivot]){
                end--;
            }
            if(start<=end){
                int temp= arr[start];
                arr[start]= arr[end];
                arr[end]= temp;
                start++; 
                end--;
            }
        }
        sort(arr, low, end);
        sort(arr, start, high);

    }
    
}
