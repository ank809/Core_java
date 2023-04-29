import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int [] arr= {2,3,5,74,34,23};
        sorting(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sorting(int[] arr, int low, int high){
        int start= low;
        int end= high;
        int pivot= start+(end-start)/2;
        if(low>high){
            return;
        }
        while(start<=end){
            while(arr[start]<arr[pivot]){
                start++;
            }
            while(arr[end]>arr[pivot]){
                end--;
            }
            if(start<=end){
                int temp=arr[start];
                arr[start]= arr[end];
                arr[end]= temp;
                start++;
                end--;
            }
        }
        sorting(arr, low, end);
        sorting(arr, start, high);
    }
}
