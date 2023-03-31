public class duplicate {
    public static void main(String[] args) {
        int[]arr={3, 4,2, 1, 4};
        int ans= sort(arr);
        System.out.print(ans);
    }
    static int sort(int [] arr){
        int i=0;
        while(i<arr.length){
        if(arr[i]!=i+1){
            int correct= arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp= arr[i];
                arr[i]= arr[correct];
                arr[correct]= temp;
            }
            else{
                return arr[i];
            }
            
        }
        else{
            i++;
        }
    }
    return -1;
    }
    
}
