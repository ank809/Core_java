public class test22 {
    static String mergeAlternately(String word1, String word2) {
        String add="";
        int k=0;
      int l1= word1.length();
      int l2= word2.length();
      for(int i=0; i<=l1-1;i++){
         
          add=add+ word1.charAt(i);
          for( int j=k; j<=l2-1;j++){
              add=add+word2.charAt(k);
              k++;
              break;
          }

      }
      if(l2>l1){
        for(int j=k; j<=l2-1; j++){
            add= add+word2.charAt(j);
        }
      }
      return add;
     
  }
  public static void main(String[] args) {
    System.out.println(mergeAlternately("ab", "pqrs"));
  }
}