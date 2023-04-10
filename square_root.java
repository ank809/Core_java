public class square_root {
    public static void main(String[] args) {
      System.out.print(sqrt(40));  
    }
    static double sqrt(int n){
        double x= n; 
        double root;
        while(true){
            root= 0.5*(x+n/x); // Newton Raphson method
            if(Math.abs(root-x)<1){
                break;
            }
            x= root;
        }
        return root;
    }
    
}
