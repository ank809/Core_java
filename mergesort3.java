import java.util.Arrays;
public class mergesort3 {
    public static void main(String[] args) {
        int[] arr={1, 4, 5, 6, 9, 8};
        mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int [] mergesort(int []arr){
        int mid= arr.length/2;
        if(arr.length==1){
            return arr;
        }
        int [] left= mergesort(Arrays.copyOfRange(arr, 0, mid));
        int [] right= mergesort(Arrays.copyOfRange(arr, mid, arr.length));
       return  merge(left, right);
    }
    static int[] merge(int [] first, int[] second){
        int [] mix= new int [first.length+ second.length];
        int k=0; 
        int i=0; int j=0;
        while(i<first.length && j<second.length){
        if(first[i]<second[i]){
            mix[k]= first[i];
            i++;   
        }
        else{
            mix[k]= second[j];
            j++;
        }
        k++;
        
    }
    if(i<first.length){
        mix[k]= first[i];
        i++;
        k++;

    }
       
    if(j<second.length){
        mix[k]= second[j];
        j++;
        k++;

    }
     return mix;  

    }
}
