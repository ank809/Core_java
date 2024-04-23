package File_Handling;

import java.io.*;

public class Outputstreamwriter {
    public static void main(String[] args) {
        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("My name is Ankita");
            osw.write(99);
            osw.write("\n");
            char[] arr = "Hello World".toCharArray();
            osw.write(arr);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
