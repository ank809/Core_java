public class bit_findunique {
    public static void main(String[] args) {
        int [] arr= {7,5,3,2,7,5,2,4,4};
        System.out.print(unique(arr));
    }
    static int unique(int []arr){
        int unique=0;
       for(int n: arr){
            unique^=n;
       }
       return unique;
    }
    
}
