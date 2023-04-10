public class recursion_number {
    public static void main(String[] args) {
        int n=1;
        print(n);
    }
    static void print(int n){
        if(n==5){
            System.out.print(5);
            return ;
        }
        System.out.println(n);
        print(++n);
    }
}
