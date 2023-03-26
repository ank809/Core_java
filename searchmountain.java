
public class searchmountain {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,4,3,2,1};
        int target=100;
        int ans= finalresult(arr, target);
        System.out.print(ans);
    }
    static int finalresult(int [] arr, int target){
        int peak= peakElement(arr);
        int isasc= orderagnosticbinarysrch(arr, target,  0, peak);
        if(isasc!=-1){
            return isasc;
        }
        else{
        int isdesc= orderagnosticbinarysrch(arr, target, peak+1, arr.length-1);
        return isdesc;
        }
    }
    static int peakElement(int [] arr){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid+1]&& arr[mid]>arr[mid-1]){
                return mid;
            }
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else if(arr[mid]<mid-1){
                end= mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int orderagnosticbinarysrch(int [] arr, int target, int start, int end){
        boolean value= arr[start]<arr[end];
        while(start<=end){
        int mid= start+(end-start)/2;
        if(mid==target){
            return mid;
        }
        if(value==true){
            if(arr[mid]<target){
                    start= mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        else{
            if(arr[mid]>target){
                start= mid+1;
        }
        else if(arr[mid]<target){
            end=mid-1;
        }
        else{
            return mid;
        }
        }
    }
    return -1;
}
    
}
