import java.util.Scanner;

public class frequencyofstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        String res = "";

        // Sorting the characters
        for (char i = 'a'; i <= 'z'; i++) {
            for (int j = 0; j <= l - 1; j++) {
                char ch = s.charAt(j);
                if (ch == i) {
                    res = res + ch;
                }
            }
        }

        // Counting and printing frequencies
        for (char j = 'a'; j <= 'z'; j++) {
            int count = 0;
            for (int i = 0; i < l; i++) {
                char ch = res.charAt(i);
                if (j == ch) {
                    count++;
                }
            }
            if (count == 0) {
                continue;
            } else {
                System.out.println(j + "-->" + count);
            }
        }
    }
}