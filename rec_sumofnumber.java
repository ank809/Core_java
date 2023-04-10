public class rec_sumofnumber {
    public static void main(String[] args) {
       int n=789;
       int sum=0;
      // System.out.print(sum_number(n, sum)) ;
       System.out.print(sum_number(n)) ;
    }
    //static int sum_number(int n, int add){
    static int  sum_number(int n){
        if(n==0){
            return n ;//add;
        }
        //add= n%10+add;
        return (n%10)+sum_number(n/10);
        //return sum_number(n/10 , add);
    }
    
}
