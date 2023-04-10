public class rec_sorted {
    public static void main(String[] args) {
        int [] arr= {1, 7, 5, 6, 8};
        System.out.print(is_sorted(arr, 0));
    }
    static boolean is_sorted(int [] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return is_sorted(arr, ++i);
        }
        return false;
    }
    
}
