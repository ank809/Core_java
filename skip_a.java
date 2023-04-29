public class skip_a {
    public static void main(String[] args) {
        String s="bnaccad";
        System.out.println(skippin("", s));
        System.out.println(skippin2( s));
        skippin1("", s);
    }
    static String skippin(String p, String up){
        if(up.isEmpty()){
            return p;
        }
        char ch= up.charAt(0);
        if(ch!='a'){
            p=p+ch;
        }
        return skippin(p, up.substring(1));
    }
    static void skippin1(String p, String up){
        if(up.isEmpty()){
            System.out.print(p);
            return ;
        }
        char ch= up.charAt(0);
        if(ch=='a'){
            skippin1(p, up.substring(1));
        }
        else{
             skippin1(p+ch, up.substring(1));
        }
    }
    static String skippin2( String up){
        if(up.isEmpty()){
            return "";
        }
        char ch= up.charAt(0);
        if(ch=='a'){
            return skippin2( up.substring(1));
        }
        return ch+skippin2( up.substring(1));
    }
    
}
