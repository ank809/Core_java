import java.util.Scanner;
public class frequencyofstr {
    Scanner sc= new Scanner(System.in);
    String s= sc.next();
    int l= s.length();
    String res="" ;
    // for sorting
    for(char b= 'a'; b<='z';b++){
        for(int j=0;j<=l-1;j++){
            char ch= s.charAt(j);
            if(ch==i){
                res= res+ch;
            }
         }
    }
    for(char b= 'a'; b<='z';b++){
        int count=0;
        for(int i=0; i<l ; i++){
            char ch= res.charAt(i);
            if(b==ch){
                count++;
            }
        }
        if(count==0){
            continue;
        }
        else{
            System.out.print(c +"-->" + count);
        }
    }
    
}

