import java.util.Scanner;

public class linearsearchstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Enter the character you want to search:");
        String chInput = sc.next();
        char ch = chInput.charAt(0); // This will extract the first character from the input string 

        int l = s.length();
        int count = 0;
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (ch == c) {
                count++;
            }
        }
        if (count != 0) {
            System.out.println("Found " + count + " occurrences of " + ch);
        }
    }
}