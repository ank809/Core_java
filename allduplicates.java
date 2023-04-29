import java.util.ArrayList;
import java.util.List;
public class allduplicates {
    public static void main(String[] args) {
        int [] arr= {2, 4, 5, 1, 6, 4,3, 4};
        System.out.println(sorting(arr, 0));
    }
    static ArrayList<Integer> sorting(int [] arr, int i){
        while(i<arr.length-1){
            int correct= arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp= arr[i];
                arr[i]= arr[correct];
                arr[correct]= temp;
            }
            else{
            i++;
        }
    }
        ArrayList<Integer> list= new ArrayList<>();
                for(i=0; i<arr.length; i++){
                    if (arr[i]!=i+1){
                        list.add(arr[i]);
                    }
                }
        return list;
                }

        }
    
