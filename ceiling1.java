import java.util.Arrays;

public class ceiling1 {
    public static void main(String[] args) {
    
        int [] arr= {1,3,5,2,7,9};
         int target=4;
        sort(arr);
        System.out.println(Arrays.toString(arr));
        int ans= ceiling(arr, target);
        System.out.println(ans);
    }
    static void sort (int []arr){
            for(int i=0; i<arr.length; i++){
                for(int j=1; j<arr.length-i; j++){
                    if(arr[j]<arr[j-1]){
                        int temp= arr[j];
                        arr[j]= arr[j-1];
                        arr[j-1]= temp;
                    }
                }
            }
    }
    static int ceiling(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]<target){
                start= mid+1;
            }
            else if(arr[mid]>target){
                end= mid-1;
            }
            else{
                return arr[mid];
            }   
        }
        return arr[start];
    }
    
}
