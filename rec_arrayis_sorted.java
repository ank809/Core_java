// https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/
public class rec_arrayis_sorted {
    public static void main(String[] args) {
       int arr[]= {22, 21, 34,56, 78};
       int l= arr.length ;
       int count = is_sorted(arr, l, 0, 0);
       if(count!=0){
        System.out.print("Yes");
       }
       else{
        System.out.print("No");
       }
    }
    static int is_sorted(int []arr, int l, int i, int count){
        if( i==l-1){
            return count;
        }
        if(arr[i]<arr[i+1]){
            count ++;
        }
        return is_sorted(arr, l, ++i, count);

    }

}
