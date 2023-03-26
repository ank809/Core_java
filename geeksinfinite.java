import java.util.Scanner;
public class geeksinfinite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr= { 1, 2,3 ,4 , 5,7 , 8, 9,10, 13, 14, 17,19, 20, 22, 26, 28};
        int target= 1;
        System.out.println(StartIndex(arr, target));
    }
     static int StartIndex(int [] arr, int target){
        int start=0;
        int end= 1;
        while(target>arr[end]){
            int tem=end+1;
            end = end+(end-start+1)*2;
            start= tem;
        }
        return BinarySearch(start, end , arr, target);
    }
static int BinarySearch(int start, int end, int []arr, int target){
    while(start<=end){
        int mid= start+(end-start)/2;
        if(target>arr[mid]){
            start= mid+1;
        }
        else if(target<arr[mid]){
            end= mid-1;

        }
        else{
            int ans= mid; ///  return index;
            return ans;
        }
    }
    return -1;
}
    
}
