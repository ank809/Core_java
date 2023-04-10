public class rec_maxormin {
    public static void main(String[] args) {
        int []arr= {0,1, 2, 4, 6, 7, 9 ,10};
        int l= arr.length;
        int max=arr[0];
        int min=arr[1];
        System.out.println("Maximum number is "+ maxno(arr, max, l, 0));
        System.out.print("Minimum number is "+ min_no(arr, min, l, 0));
    }
 static int maxno(int[]arr, int max, int l , int i){
        if(i==l){
            return max;  
        }
        if(max<arr[i]){
            max= arr[i];
        }
        return maxno(arr, max, l, ++i);
 }

 static int min_no(int[] arr, int l, int min, int i){
    if(i==l){
        return min;
    }
    if(min>arr[i]){
        min=arr[i];
    }
    i++;
    return min_no(arr, l, min, i);
 }     
    }
    

