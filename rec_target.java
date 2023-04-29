public class rec_target {
    public static void main(String[] args) {
        int [] arr= {2,4,6,8,9,23,55,9};
        System.out.print(is_present(arr, 90, 0));
    }
    static int is_present(int [] arr, int target, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]== target){
            return i;
        }
        return is_present(arr, target, i+1);
        
    }
}