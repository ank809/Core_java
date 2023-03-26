import java.util.Scanner;
public class twodarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[][]= new int[3][2];
        for(int r=0; r<3; r++){
            for(int c=0; c<2; c++){
                arr[r][c]= sc.nextInt();
            }
        }
        for(int r=0; r<3; r++){
            for(int c=0; c<2; c++){
                 System.out.print(arr[r][c]+" ");
                // System.out.println( Arrays.toString(arr[r]));
            }
            
            System.out.println();
        }
    }
    
}
