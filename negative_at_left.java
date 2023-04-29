import java.util.Arrays;

public class negative_at_left {
    public static void main(String[] args) {
        int [] arr={2,4,5,-1, 0,1,3};
        System.out.println(Arrays.toString(sort(arr, 0)));
    }
   
    static int[] sort(int []arr, int i){
       for(i=0; i<arr.length-1; i++){
        for(int j=1; j<arr.length-i; j++){
            if(arr[j]<arr[j-1]){
                int temp= arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
            }

        }
       }
       return arr;
    }
    
}
