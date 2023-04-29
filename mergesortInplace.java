import java.util.Arrays;
public class mergesortInplace {
    public static void main(String[] args) {
        int [] arr= {2,10,7, 3 , 9, 6};
        mergesortINplace(arr, 0 ,arr.length);
        System.out.print(Arrays.toString(arr));
    }
    static void  mergesortINplace(int[]arr, int start, int end){
        int mid= start+(end-start)/2;
        if((end-start)==1){
            return ;
        }
        mergesortINplace(arr, start, mid);
        mergesortINplace(arr, mid, end);
        mergeinplace(arr, start, mid, end);
    }
    static void mergeinplace(int [] arr, int start, int mid, int end){
        int [] mix= new int[end-start];
        int i=start;
        int j= mid;
        int k=0;
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                mix[k]= arr[i];
                i++;
            }
            else{
                mix[k]= arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mix[k]= arr[i];
            i++;
            k++;
        }
        while(j<end){
            mix[k]=arr[j];
            j++; 
            k++;
        }
        for(int l=0; l<mix.length ; l++){
         arr[start+l]= mix[l];   

    }
    
}
}