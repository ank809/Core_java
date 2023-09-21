package Stack_And_Queues;
import java.util.Arrays;
import java.util.Scanner;
public class GameOfStacks {
    static int twoStacks(int []a, int []b, int maxsum){
        return twoStacks(a, b, maxsum, 0, 0);
    }

   static  int twoStacks(int []a, int []b, int maxsum,int count, int sum ){
    if(sum>maxsum){
        return count;
    }
    if(a.length==0 || b.length==0){
        return count;
    }
    int ans1= twoStacks(Arrays.copyOfRange(a, 1, a.length), b, maxsum, count+1, sum+a[0]);
     int ans2=twoStacks(a, Arrays.copyOfRange(b, 1, b.length), maxsum, count+1, sum+b[0]);
     int max= Math.max(ans1, ans2);
     return max;
    
   }

   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    for(int i=0; i<n; i++){
    int x= sc.nextInt(); // size of array 1
    int y=sc.nextInt(); // size of array 2
    int sum=sc.nextInt(); // maximum sum
    int a[]= new int[x];
    int []b= new int[y];
    for(int j=0; j<x; j++){
       a[j]= sc.nextInt();
    }

    for(int k=0; k<y; k++){
        b[k]=sc.nextInt();
    }

    System.out.println(twoStacks(a, b, sum));
    }

   }
}
