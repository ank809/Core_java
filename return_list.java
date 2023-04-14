import java.util.ArrayList;

public class return_list {
    public static void main(String[] args) {
        int []arr={2,  2, 2 ,5 ,5, 6,7};
        //int target= 2;
        ArrayList<Integer> ans= findalllindex(arr, 5, 0, new ArrayList<>());
        System.out.println(ans);
        System.out.print(findalllindex2(arr, 2, 0));

    }
    static ArrayList<Integer> findalllindex(int[] arr, int target, int i, ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        
            return findalllindex(arr, target, i+1, list);
    }
    static ArrayList<Integer> findalllindex2(int[] arr, int target, int i){
        ArrayList<Integer> list= new ArrayList<> ();
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        
            ArrayList<Integer> frombelowcalls= findalllindex2(arr, target, i+1);
            list.addAll(frombelowcalls);
            return list;
    }
    
}
