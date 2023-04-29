public class skip_apple {
    public static void main(String[] args) {
        System.out.println(skip("bcdapplebc"));
        System.out.print(skipAppnotApple("bcdapplebc"));
    }
    static  String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        //char ch= up.charAt(0);
        if(up.startsWith("apple")){
            return skip(up.substring(5));
        }
        else{
        return up.charAt(0)+skip(up.substring(1));
    }
}
    static  String skipAppnotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        //char ch= up.charAt(0);
    if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppnotApple(up.substring(3));
        }
        else{
        return up.charAt(0)+skipAppnotApple(up.substring(1));
    }
    }
}

