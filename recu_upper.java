public class recu_upper {
    public static void main(String[] args) {
       String s="ankitA";
       int l= s.length(); 
       System.out.print(is_upper(s, l, 0));
    }
 static char is_upper(String s, int l, int i){
        char  ch= s.charAt(i);
        if(ch>=65 && ch<=90){
            return ch;
        }
       if(i==l){
            return ch ;
        }
     return is_upper(s, l, ++i);
 }
    
}
