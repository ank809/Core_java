public class rec_primeno {
    public static void main(String[] args) {
        int n= 4;
        int i=1;
        int count=0;
       int check= is_primeno(n, i, count);
       if(check==2){
        System.out.println("Yes");
       }
       else{
        System.out.println("No");
       }
    }
    static int is_primeno(int n, int i, int count){
        if(i>n){
            return count;
        }
        if(n%i==0){
            count++;
        }
        return is_primeno(n, ++i, count);
    }
    
}
