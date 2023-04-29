// public class remove_a_fromstring {
//     public static void main(String[] args) {
    //     String s="baacadae";
    //     String n="";
    //     int l= s.length();
    //     for(int i=0; i<l; i++){
    //         char ch= s.charAt(i);
    //         if(ch!='a'){
    //             n= n+ch;
    //         }
    //     }
    //     System.out.print(n);
    // }
    

    //USING RECURSION
//     String s= "bcadaae";
//     String n="";
//     System.out.print(remove_a(s, n , 0));


//     }
//     static String remove_a(String s, String n, int i ){
//         int l= s.length();
//         if(i==l){
//             return n;
//         }
//         char ch= s.charAt(i);
//         if(ch!='a'){
//             n= n+ch;
//         }
//         return remove_a(s, n, i+1);
//     }

// }

// USING RECURSION 
public class remove_a_fromstring {
    public static void main(String[] args) {
       remove("", "bcadesa"); 
    }
    static void remove(String p, String up){
        if(up.isEmpty()){
            System.out.print(p);
            return;
        }
        char ch= up.charAt(0);
        if(ch=='a'){
            remove(p, up.substring(1));
        }
        else{
            remove(p+ch, up.substring(1));
        }
    }
}