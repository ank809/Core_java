import java.util.Arrays;
public class Selection_Sort {
    public static void main(String[] args) {
        int arr[]={3, 4, 5, 1, 2};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
       
    }
    static void Selection(int [] arr){
             for(int i=0; i<arr.length; i++){
            int last=arr.length-i-1;
            int max=getMax(arr, 0, last);
            swap(arr, max, last);
        }
    }
    static int getMax(int arr[], int start, int last){
        int max= start;
        for(int i=start; i<=last; i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int arr[], int first, int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]= temp;
    }
    
}
