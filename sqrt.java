public class sqrt {
    public static void main(String[] args) {
        int n=40;
        int ans= squareroot(n);
        System.out.print(ans);
    }
    
    static int squareroot(int n){
       int start=0;
       int end=n;
       while(start<=end){
        int m= start+(end-start)/2;
        if(m*m==n){
            return m;
        }
       if(m*m <n){
            start= m+1;
        }
        else{
            end= m-1;
        }
       }
       return -1; 
    }
    
}
