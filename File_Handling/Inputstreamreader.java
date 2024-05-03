package File_Handling;

/*  Streams : sequence of data
1. Byte  (image, pdfs, files etc) : Defined in 2 class heirarchy
a. InputStream
b. OutputStream 

Both extends Object Class 
2. Character Unicode : for unicode characters 
a. Reader
b. Writer
java.io package for input and output

Predefined Streams
System.out -> standard output stream by console (PrintStream)
System.in -> standard input stream by keyboard (InputStream)
System.err -> standard error stream (PrintStream)
*/

import java.io.InputStreamReader;
import java.io.IOException;

public class Inputstreamreader {
    public static void main(String[] args) {

        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.print("Enter some letters");
            // it reads a single character from the input stream and return its unicode
            // value
            int letters = isr.read();
            while (isr.ready()) {
                System.out.println((char) letters);
                letters = isr.read();
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
