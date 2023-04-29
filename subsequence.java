import java.util.ArrayList;
//import java.util.Arrays;
public class subsequence {
    public static void main(String[] args) {
        subseq("", "abc");
       System.out.println(subseq1("", "abcd"));
       
    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        subseq(p+ch, up.substring(1)); // take it 
        subseq(p, up.substring(1)); // or just ignore it
        // to print in order just exchhange the calling functions 
    }
    static ArrayList<String> subseq1(String p, String up ){
        if(up.isEmpty()){
        ArrayList<String> list= new ArrayList<>();
        list.add(p);
        return list;  
        }
        char ch= up.charAt(0);
        ArrayList<String> left= subseq1(p+ch, up.substring(1)); // take it 
          ArrayList<String> right= subseq1(p, up.substring(1)); // or just ignore it
        left.addAll(right);
        return left; 
    }

   
}
