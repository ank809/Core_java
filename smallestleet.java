import java.util.Scanner;
//https://leetcode.com/submissions/detail/908775609/ Question link
public class smallestleet {
    public static void main(String[] args) {
        char []arr= {'a', 'c', 'f', 'g'};
        char target= 'b';
        char ans= smallestgreater(arr, target);
        System.out.println(ans);  
    }
    static char  smallestgreater(char []arr, char target){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target>arr[mid]){
                start= mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return arr[start% arr.length ];
    }
    
}
