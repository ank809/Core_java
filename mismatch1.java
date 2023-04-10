import java.util.Arrays;

public class mismatch1 {
   public static void main(String[] args) {
    int [] arr= {4, 2, 1,6, 5, 2};
System.out.print(Arrays.toString(sort(arr)));
   }
   static int[] sort(int[] arr){
    int i=0;
    while(i<arr.length){
        int correct=   arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp= arr[i];
                arr[i]= arr[correct];
                arr[correct]= temp;
            }
            else{
                i++;
            }
        }
        for(int index=0; index<arr.length; index++){
            if(arr[index]!=index+1){
                return new int [] {arr[index], index+1};
            }
        }
        return new int[] {-1 , -1};
    }
    }
   
   
   
   
    

