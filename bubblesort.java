import java.util.Arrays;
public class bubblesort {
    public static void main(String[] args) {
        //int [] arr={ 3, 4, 5, 2,1};
        //int [] arr={ -23, -4, 0, -42,1};
        //int [] arr={};
        int [] arr={1};
        sorting(arr);
        System.out.print(Arrays.toString(arr));
    
    }
    static void  sorting (int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }
                
            }
        }
    }
    
}
