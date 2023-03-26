import java.util.Arrays;
import java.util.Scanner;
public class arraystring2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        String arrout[]= new String [n];
        sc.nextLine();
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextLine();
        }
        for(int j=0; j<n; j++){
            String rev="";
            String s= arr[j];
            for(int k= s.length()-1; k>=0; k--){
                char ch=s.charAt(k);
                rev= rev+ch;
            }
        arrout[j]=rev;
        }
       
        System.out.println(Arrays.toString(arrout));
        
        
    }
}
    

