public class rec_triangle {
    public static void main(String[] args) {
        pattern2(4, 0);
        // pattern(4, 0); 
    }
    // static void pattern(int r, int c){
    //     if(r==0){
    //         return ;
    //     }
    //     if(c < r){
    //         System.out.print("*");
    //         pattern(r, c+1);
    //     }
        
    //     else{
    //         System.out.println();
    //         pattern(r-1, 0);
    //     }
        static void pattern2(int r, int c){
            if(r==0){
                return ;
            }
            if(c < r){
                pattern2(r, c+1);
                System.out.print("*");
               
            }
            
            else{
                
                pattern2(r-1, 0);
                System.out.println();
            }
    }
}
