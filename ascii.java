import java.util.ArrayList;
public class ascii {
    public static void main(String[] args) {
        subset("", "ab");
        System.out.print(subseq1("", "ab"));
    }
    static void subset(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        subset(p+ch, up.substring(1));
        subset(p, up.substring(1) );
        subset(p+(ch+0), up.substring(1));
    }
    static ArrayList<String> subseq1(String p, String up ){
        if(up.isEmpty()){
        ArrayList<String> list= new ArrayList<>();
        list.add(p);
        return list;  
        }
        char ch= up.charAt(0);
        ArrayList<String> first= subseq1(p+ch, up.substring(1)); // take it 
          ArrayList<String> second= subseq1(p, up.substring(1)); // or just ignore it
          ArrayList<String> third= subseq1(p+(ch+0), up.substring(1)); // or just ignore it
        first.addAll(second);
        first.addAll(third);
        return first; 
    }

   
    
}
