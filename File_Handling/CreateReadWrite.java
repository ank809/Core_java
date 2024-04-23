package File_Handling;

import java.io.*;
import java.util.Scanner;

public class CreateReadWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creating a file
        try {
            File fo = new File("NewFile");
            fo.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Writing into file
        try (FileWriter fw = new FileWriter("NewFile")) {
            String s = sc.nextLine();
            fw.write(s);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Reading from file character by character

        try (FileReader fr = new FileReader("NewFile")) {
            int text = fr.read();
            while (text != -1) {
                System.out.println((char) text);
                text = fr.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        // Reading line from the file
        try (BufferedReader br = new BufferedReader(new FileReader("NewFile"))) {

            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

}
