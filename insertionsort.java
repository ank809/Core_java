import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int [] arr= {5, 3, 6,1,2};
        int find=4;
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(smallestgreaterthantarget(arr, find));
    }
    static void sort(int [] arr){
        for(int i=0;  i<arr.length-2; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp= arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }
                else{
                    break;
                }
            }
        }
    }
    static int smallestgreaterthantarget(int [] arr, int find){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]<find){
                start=mid+1;
            }
            else if(arr[mid]>find){
                end=mid-1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];
    }
    
}
