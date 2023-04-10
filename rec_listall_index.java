import java.util.ArrayList;

public class rec_listall_index {
        public static void main(String[] args) {
            int []arr= {31,31,31,5,7,31,30};
            int target=31;
            //System.out.println(list);
            linearsearch(arr, target, 0);
             System.out.println(list);
        }
        // static int linearsearch(int[]arr, int target,  int i){
        //     if(i==arr.length-1){
        //         return -1;
        //     }
        //     if(arr[i]!=target){
        //         return linearsearch(arr, target, ++i);
        //     }
        //         return i;
            
        // }
        static ArrayList<Integer> list= new ArrayList<>();
        static void linearsearch(int[]arr, int target,  int i){
            if(i==arr.length-1){
                return ;
            }
            if(arr[i]==target){
                list.add(i);
            }
             linearsearch(arr, target, ++i);
            
        }
        
    }



