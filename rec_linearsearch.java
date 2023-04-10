public class rec_linearsearch {
    public static void main(String[] args) {
        int []arr= {1,3,5,7,18,30};
        int target=31;
        System.out.print(linearsearch(arr, target, 0));
    }
    static int linearsearch(int[]arr, int target,  int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]!=target){
            return linearsearch(arr, target, ++i);
        }
        // if(arr[i]== target){
            return i;
        //}
    }
    
}
