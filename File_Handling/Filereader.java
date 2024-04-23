package File_Handling;

import java.io.*;

public class Filereader {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("AWS")) {
            // read returns integer
            // int letters= fr.read();
            char letters = (char) fr.read();
            while (fr.ready()) {
                // System.out.print((char)letters);
                System.out.print(letters);
                letters = (char) fr.read();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
