import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class iterationarr {
    public static void main(String[] args) {
        int[] arr={1, 2,3};
        int arr1[]= {2,1,2};
        List<List<Integer>>ans= subset(arr);
        for(List<Integer>list :ans){
            System.out.println(list);
        }
        List<List<Integer>>ans1= duplicatesubset(arr1);
        for(List<Integer>list1 :ans1){
            System.out.println(list1);
        }
    }
    static List<List<Integer>> subset(int [] arr){
        List<List<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num:arr){
            int n= outer.size();
            for (int i=0; i<n; i++){
                List<Integer> internal= new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    static List<List<Integer>> duplicatesubset(int [] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer= new ArrayList<>();
        int start=0;
        int end=0;
        outer.add(new ArrayList<>());
        for (int i=0; i<arr.length; i++){
            start=0;
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end= outer.size()-1;
            int n= outer.size();
            for (int j=start; j<n; j++){
                List<Integer> internal= new ArrayList<>(outer.get(j));
                internal.add(i);
                outer.add(internal);
            }
        }
        return outer;
    }
    
}
