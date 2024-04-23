package File_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("AWS", true)) {
            // It overrides the data
            fw.write("HELLO MY NAME IS ANKITA");
            // If you want to append the data
            fw.write(" This text should be appended");

        } catch (IOException e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }
    }
}
