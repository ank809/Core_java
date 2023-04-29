public class rec_issort {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        boolean ans= is_sorted(arr, 0);
        System.out.print(ans);
    }
    static boolean is_sorted(int [] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        // if(arr[i]<arr[i+1]){
        //     return is_sorted(arr, i+1);
        // }
        // else{
        //     return false;
        // }
       return   arr[i]<arr[i+1] && is_sorted(arr, i+1);
    }
    
}
