import java.util.ArrayList;

public class linearsearch_rec{
    public static void main(String[] args) {
        int [] arr= {1,3 ,55, 89,  55, 9,434,23};
        int target = 55;
        System.out.println(linearsearch(arr, target, 0));
        System.out.println(findIndexStart(arr, target, 0));
        System.out.println(findIndexEnd(arr, target, arr.length-1));
        findAllIndex(arr, target, 0);
        System.out.println(list) ; 
        System.out.println(findAllIndex1(arr, target, 0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, target, 0));
    }
    static boolean linearsearch(int []arr, int target, int i ){
        if(i==arr.length-1){
            return false;
        }
        return arr[i]== target || linearsearch(arr, target, ++i); 
    }
    static int findIndexStart(int [] arr, int target, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]== target){
            return i;
        }
        return findIndexStart(arr, target, ++i);
    }
    static int findIndexEnd(int [] arr, int target, int i){
        if(i<0){
            return -1;
        }
        if(arr[i]== target){
            return i;
        }
        return findIndexEnd(arr, target, --i);
    }
    static ArrayList<Integer> list= new ArrayList<>();
    static void findAllIndex(int []arr,int  target, int i){
        if(i==arr.length){
            return ;
        }
        if(arr[i]== target){
            list.add(i);
        }
         findAllIndex(arr, target, ++i);

    }
    static ArrayList<Integer> findAllIndex1(int []arr, int  target, int i, ArrayList<Integer> ls ){
        if(i==arr.length-1){
            return ls;
        }
        if(arr[i]== target){
            ls.add(i);
        }
        return  findAllIndex1(arr, target, ++i, ls);

    }
    static ArrayList<Integer> findAllIndex2(int []arr, int  target, int i ){
        ArrayList<Integer> ls= new ArrayList<>();
        if(i==arr.length){
            return ls;
        }
        if(arr[i]== target){
            ls.add(i);
        }
        ArrayList<Integer> ansfrombelowcalls= findAllIndex2(arr, target, i+1);
        ls.addAll(ansfrombelowcalls);
        return ls;

    }
    
    
}
