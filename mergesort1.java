import java.util.Arrays;

public class mergesort1 {
    public static void main(String[] args) {
        int [] arr={2,5,6,7,2,1};
        arr= mergesort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int [] mergesort(int []arr){
            int mid= arr.length/2;
            if(arr.length==1){
                return arr;
            }
            int []left= mergesort(Arrays.copyOfRange(arr, 0, mid));
            int []right= mergesort(Arrays.copyOfRange(arr, mid, arr.length));
            return merge(left, right);
    }
    static int[] merge(int [] first, int [] second){
        int [] mix=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
            mix[k]= first[i];
            i++;
         
        }
        else{
            mix[k]= second[j];
            j++;
          
        }
        k++;
    }
    while(i<first.length){
        mix[k]= first[i];
        i++;
        k++;
    }
    while(j<second.length){
        mix[k]= second[j];
        j++;
        k++;
    }
    return mix;
    }
    
}
