import java.util.Arrays;
public class twodarraysearch {
    
    public static void main(String[] args) {
        int [][] arr= {
            {10,20,30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        int target= 23;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int [][] arr, int target){
        int row=0;
        int column= arr.length-1;
            while(row<=arr.length-1 && column >=0){
                if(arr[row][column]==target){
                    return new int[]{ row, column};
                }
                if(arr[row][column]<target){
                    row++;
                }
                else{
                    column--;
                }
            }
            return  new int[]{-1, -1};
    }
}
