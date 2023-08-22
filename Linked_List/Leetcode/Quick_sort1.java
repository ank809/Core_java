package Leetcode;

import java.util.Arrays;

public class Quick_sort1 {
    public static void main(String[] args) {
        int arr[]= {9, 3, 4, 5, 8, 2, 7};
        Merge(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void Merge(int [] arr, int low, int high){
        int s=low;
        int e= high;
        int m= s+(e-s)/2;
        int pivot= arr[m];
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
        Merge(arr, low, e);
       Merge(arr, s, high);
    }
    
}
