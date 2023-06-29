import java.util.List;
import java.util.ArrayList;
public class listofmissing {
    public static void main(String[] args) {
        int [] arr= {3, 0, 1};
        List<Integer> ans= sort(arr);
        System.out.print(ans);
    }
    static List<Integer> sort(int [] arr){
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
        List<Integer> ans = new ArrayList<>();
            for(int index=0; index <arr.length; index++){
                if(arr[index]!=index+1){
                ans.add(index+1);
               
            }    
        }
        return ans;
    }
}

    



