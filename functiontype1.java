import java.util.*;
public class functiontype1 {
    public static void main(String[] args) {
        System.out.println(" this is function type 1 ");

        sum();
    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum is" + (a + b));
    }
}
