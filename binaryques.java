

import java.util.Arrays;
import java.util.Scanner;
public class binaryques {
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print(Arrays.toString(arr));
        
        int s=0;
        int e=arr.length-1;
        int c=0;
        if(arr[s]<arr[e]){
            System.out.println("Ascending order");
            c=1;
        }
        else{
            System.out.println("Descending order");
        }
        System.out.println("Enter the target element:");
        int target= sc.nextInt();
        int result;
        if(c==1){
                 result = ascendingorder (arr, target);

        }
        else{
                result= descendingorder(arr, target); 

        }
        if(result==target){
            System.out.println("found");
        }
        else{
            System.out.println("not found:");
        }

        }

        static int ascendingorder (int []arr, int target){
            int s=0;
            int e= arr.length-1;
            while(s<=e){
            int mid= s +(e-s)/2;
            if(target<arr[mid]){
                e=mid-1;
            }
            else if(target>arr[mid]){
                s=mid+1;
            }
            else{
                return arr[mid];
            }
            }
            return -1;
        }
        static int descendingorder(int []arr, int target){
            int s=0;
            int e= arr.length-1;
            while(s<=e){
            int mid= s+(e-s)/2;
            if(target>arr[mid]){
                e=mid-1;
            }
            else if(target<arr[mid]){
                s=mid+1;
            }
            else{
                return arr[mid];
            }
            }
            return -1;
        }

    }
