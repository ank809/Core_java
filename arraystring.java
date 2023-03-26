import java.util.Scanner;
public class arraystring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of string:");
        int n= sc.nextInt();
        String arr[]= new String[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextLine();
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        for(int j=0; j<arr.length; j++){
            System.out.println(arr[j]+ "-->"+j+ arr[j].length());
        }
    }
    
}
