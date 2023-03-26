import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range of array;");
        int n= sc.nextInt();
        System.out.println("Enter the elements in array:");
        int arr[]= new int[n];
        for(int i=0 ; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the number you want to search");
        int target=sc.nextInt();
       int count =0;
        for(int i=0; i<arr.length; i++){
            if(target==arr[i]){
                count =1;
                break;
            }
        }
        if(count!=0)
            System.out.println("Found");
        else
            System.out.println("Nhi Mila");
    }
    
}
