public class listofmissing {
    public static void main(String[] args) {
        int [] arr= {3, 0, 1};
        int ans= sort(arr);
        System.out.print(ans);
    }
    static int sort(int [] arr){
        int i=0;
        while(i<arr.length){
            int correct= arr[i];
            if( arr[i] < arr.length && arr[i]!= arr[correct]){
                int temp= arr[i];
                arr[i]= arr[correct];
                arr[correct]= temp;
            }
            else{
                i++;
            }
        } 
        List<Integer> ans = new ArraysList<>();
            for(int index=0; index <arr.length; index++){
                if(arr[index]!=index+1){
                ans.add(index+1);
               
            }    
        }
        return ans;
    }
}

    



