package Leetcode;

import java.util.Arrays;
public class Quick_Sort {
    public static void main(String[] args) {
        int [] arr={5, 4, 3, 2, 1};
        sort( arr, 0, arr.length-1  );
        System.out.print(Arrays.toString(arr));
    }
    static void sort(int [] arr, int low, int high){
        int s=low;
        int e=high;
        int mid= s+(e-s)/2;
        int pivot=arr[mid];
        if(low>=high){
            return;
        }
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
            }
        }
        sort(arr, low, e);
        sort(arr, s, high);
    }
}
