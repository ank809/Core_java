import java.util.Arrays;
public class insertionsort1 {
    public static void main(String[] args) {
        int [] arr= {10, 5,7,8,2,1,3};
        int target= 5;
        sort(arr);
        System.out.println(Arrays.toString(arr));
        int ans= startend(arr, target);
        System.out.print(ans);
    }
    static void sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp= arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }
    }
    static int  startend(int[]arr, int target){
        int start=0;
        int end= 1;
        while(arr[end]<target){
            int temp= end+1;
            end= end*(end-start+1);
            start=temp;
        } 
       return searchrange (arr, target, start, end);
        
    }
    static int searchrange(int[]arr, int target, int start, int end){
        while(start<=end){
            int mid= start+(end-start)/2;
  .          if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                int res = arr[mid];
                return res;
            }
        }
        return -1;
    }
    
}
