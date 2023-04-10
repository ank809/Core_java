public class factorial_number {
    public static void main(String[] args) {
      int n= 3;
      int fact=1;
      int i=1;
      System.out.print(factorial_no(n, fact, i));  
    }
    static int factorial_no(int n, int fact, int i){
            if(i>n){
                return fact;
            }
            fact= fact*i;
            return factorial_no(n, fact, ++i);
    }

    
}
