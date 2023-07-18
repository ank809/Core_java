import java.util.* ;
public class search_in_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter number of elements you want to insert in array");
        int n=sc.nextInt();
         int [] arr= new int[n];
        for(int i=0; i<n; i++){
            int num= sc.nextInt();
            arr[i]=num;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter your target element");
        int target= sc.nextInt();
        int s=0;
        int e= n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                System.out.println("element present");
                break;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }

        }

    }
    
}
