public class remove_apple {
    public static void main(String[] args) {
        System.out.println(remove("", "bcapplennd"));
        System.out.println(remove1("", "bcapplennd"));
        System.out.println(remove2( "bcappnnd"));
    }

    static String remove(String p ,String up){
        if(up.isEmpty()){
            return p;
        }
        char ch= up.charAt(0);
        if(up.startsWith("apple")){
            return remove(p, up.substring(5));
        }
        else{
            return ch+ remove(p, up.substring(1));
        }
    }
    static String remove1(String p, String up){
        if(up.isEmpty()){
            return p;
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return remove1(p, up.substring(3));
        }
        else{
            return up.charAt(0)+ remove1(p, up.substring(1));
        }
    }
    static String remove2(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return remove2(up.substring(3));
        }
        else{
            return up.charAt(0)+ remove2(up.substring(1));
        }
    }


    
}
