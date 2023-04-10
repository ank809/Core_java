public class rec_reversestring {
    public static void main(String[] args) {
        String s= "Ankita";
        String rev="";
        int l= s.length();
        int i= l-1;
     System.out.print(rev_string(s, rev, l, i));
    }
    static String rev_string(String s, String rev1, int l, int i){
        if(i<0){
            return rev1;
        }
        char ch= s.charAt(i);
        rev1 = rev1+ch;
        return rev_string(s, rev1, l, --i);
    }
    
}
