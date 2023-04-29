import java.util.ArrayList;
public class permutation {
    public static void main(String[] args) {
        permutation1("", "abc");
        ArrayList<String> ans= new ArrayList<>();
        ans= permutation2("", "abc");
        System.out.println(ans);
        System.out.println(permutationcount("", "abc"));

    }
    static void permutation1(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String f= p.substring(0,i);
            String s= p.substring(i, p.length());
            permutation1(f+ch+s, up.substring(1));
        }
    }
    static ArrayList<String> permutation2(String p, String up){
        if(up.isEmpty()){
           ArrayList<String> list= new ArrayList<>();
           list.add(p);
            return list;
        }
        ArrayList<String> ans= new ArrayList<>();
        char ch= up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String f= p.substring(0,i);
            String s= p.substring(i, p.length());
            ans.addAll(permutation2(f+ch+s, up.substring(1)));
        }
        return ans;
    }
    static int permutationcount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char ch= up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String f= p.substring(0,i);
            String s= p.substring(i, p.length());
             count = count +permutationcount(f+ch+s, up.substring(1));
        }
        return count;
    }
    
}
