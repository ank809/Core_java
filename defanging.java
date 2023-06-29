import java.util.Scanner;

public class defanging  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the address:");
        String s = sc.nextLine();
        int l = s.length();
        String d = "[.]";
        for (int i = 0; i <= l - 1; i++) {
            char c = s.charAt(i);
            if (c == '.') {
                c = d.charAt(0); // Assign the first character of d to c
            }
        }
        System.out.print(d);
    }
}