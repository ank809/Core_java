import java.util.Arrays;

public class bubblesort1 {
 public static void main(String[] args) {
    int [] arr= {4, 5, 3, 1, 2};
    sort(arr);
    System.out.print(Arrays.toString(arr));
 }
 static void sort (int[]arr){
    for(int i=0;  i<arr.length; i++){
        for(int j=1; j<arr.length-i; j++){
            if(arr[j]<arr[j-1]){
                int temp= arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
            }
        }
    }

 }

   

    
}
