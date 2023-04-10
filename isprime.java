public class isprime {
    public static void main(String[] args) {
        int n=40;
        for(int i=0; i<n; i++){
            int  value= is_Prime(i,0);
            if(value==2){
                System.out.println(i+ " "+ true);
            }
            else{
                System.out.println(i+ " "+ false);
            }
            
        }
    }
   
    static int  is_Prime(int i, int count){
        for(int j=1; j<=i; j++){
            if(i%j==0){
                count ++;
            }
        }
        return count ; 
    }
    
}
