public class rec_palindrome {
    public static void main(String[] args) {
      int n=341;
      int rev=is_palindrome(n, 0);
      if(rev==n){
        System.out.println("Yes");
      } 
      else{
        System.out.println("No");
      }
    }
    static int is_palindrome(int n , int rev){
        if(n==0){
        return rev;
        }
    rev= rev*10+n%10;  
    return is_palindrome(n/10, rev);
    }
    
}
