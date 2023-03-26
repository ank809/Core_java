import java.util.Scanner;
public class leetapbq {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);

    
    System.out.print("Enter a string: ");
    String a=sc.nextLine();
    System.out.print("Enter a string: ");
    String b= sc.nextLine();
    String add="";
    int k=0;
    int l1= a.length();
    int l2= b.length();
    for(int i=0; i<=l1-1; i++){
        char ch= a.charAt(i);
        add= add+ch;
        for(int j=k; j<=l2-1; j++){
            char c= b.charAt(j);
            add=add+c;
            k++;
            break;

        }
    }
    if (l2>l1){
        for(int d=k; d<=l2-1; d++){
            char e= b.charAt(d);
            add=add+e;
        }
       
    }
    System.out.print(add);
}
}

