import java.util.Scanner;
public class nearest {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        int  arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        double  currentdiff= Integer.MAX_VALUE;
        int minval=arr[0];
            for(int i=0; i<n; i++){
                int mindiff= Math.abs(arr[i]-target);
                if(mindiff<currentdiff){
                    currentdiff= mindiff;
                    minval=arr[i];
                }
            }
    
    System.out.println(minval);
}
}

