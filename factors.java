public class factors {
    public static void main(String[] args) {
        //factorsare(40);
        factorsare1(40);
    }
    // static void factorsare(int n){
    //     for(int i=2; i<n; i++){
    //         if(n%i==0){
    //             System.out.println(i);
    //         }
    //     }
        
    // }
    static void factorsare1(int n){
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println(i+" "+ i/2);
            }
        }
        
    }
    
}
