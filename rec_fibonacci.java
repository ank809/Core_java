public class rec_fibonacci {
    public static void main(String[] args) {
      System.out.print(fibo(6));  
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    
}
// 0, 1, 1, 2, 3, 5 ,8