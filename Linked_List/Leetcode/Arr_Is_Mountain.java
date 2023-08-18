 // https://leetcode.com/problems/valid-mountain-array/submissions/
package Leetcode;

public class Arr_Is_Mountain {
        public boolean validMountainArray(int[] arr) {
            if(arr.length<3){
                return false;
            }
            int peak=0;
            int i=1;
            while(i<arr.length-1 && i>=1){
                if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                    peak=i;
                }
                i++;
            }
            if(peak==0 || peak== arr.length-1){
                return false;
            }
            for(int j=0; j<peak; j++){
                if(arr[j]==arr[j+1]){
                    return false;
                }
                if(arr[j]>arr[j+1]){
                    return false;
                }
            }
            for(int j=peak; j<arr.length-1; j++){
                if(arr[j]==arr[j+1]){
                    return false;
                }
                if(arr[j]<arr[j+1]){
                    return false;
                }
            }
        return true;
        }
    }
