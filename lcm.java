public class lcm {
    public static void main(String[] args) {
      System.out.print(lcm_num(4,16));  
    }
    static int lcm_num(int a, int b){
        
        return a*b/gcd(b%a, a);
    }
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }
    
}
