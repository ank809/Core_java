import java.util.Arrays;

public class twodarraysearch1 {
    public static void main(String[] args) {
        int [][]arr = {
            {1, 2, 3,4},
            {5, 6, 7, 8},
            {9,  10, 11, 12}
        };
        int target = 7;
        int[] ans = search(arr, target);
        System.out.print(Arrays.toString(ans));
    }

static int[] search (int[] [] arr, int target){
    int row=0;
    int column= arr.length-1;
    while(row<=arr.length-1 && column>=0){
        if(arr[row][column] == target){
            return new int [] {row, column};
        }
        if(arr[row][column]<target){
            row++;
        }
        else{
            column--;
        }
    }
    return new int[] {-1, -1};
}
}
