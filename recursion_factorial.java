public class recursion_factorial 
 {
    public static void main(String[] args) {
        int n=7;
        int i=1;
        int fact=1;
        System.out.print(is_factorial(n, i, fact));
       
    }
    static int is_factorial(int n, int i, int fact ){
      if(i>n){
         return fact;  
      }
      fact= fact*i;
      i++;
      return is_factorial(n, i, fact);

    }
    
}
