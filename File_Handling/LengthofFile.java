package File_Handling;
import java.io.File;

public class LengthofFile {
    public static void main(String[] args) {
        File fo = new File("File.txt");
        if (fo.exists()) {
            System.out.println(fo.length());
        } else {
            System.out.println("File foes not exist");
        }
    }
}
