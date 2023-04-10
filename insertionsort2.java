import java.util.Arrays;
public class insertionsort2 {
    public static void main(String[] args) {
        int arr[]= {5, 6, 2, 7, 4,1,9};
        insertionsort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void insertionsort(int[]arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp =arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
                            