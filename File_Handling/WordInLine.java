package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WordInLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "example";
        int count = 1;
        try {
            BufferedReader br = new BufferedReader(new FileReader("File.txt"));
            while (br.ready()) {
                String line = br.readLine();
                if (line.contains(str)) {
                    System.out.println(count);
                    break;
                }
                count++;
                br.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("File.txt", true));
            System.out.println("Written Successfully");
            bw.write("Hello World");
            System.out.println("Written Successfully");
            bw.close();
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
