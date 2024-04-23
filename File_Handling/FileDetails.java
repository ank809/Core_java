package File_Handling;

import java.io.File;

public class FileDetails {
    public static void main(String[] args) {
        File fo = new File("NewFile");
        if (fo.exists()) {
            System.out.println("File name: " + fo.getName());
            System.out.println("Absolute Path: " + fo.getAbsolutePath());
            System.out.println("Readable: " + fo.canRead());
            System.out.println("Writeable: " + fo.canWrite());
            System.out.println("Length: " + fo.length());
        } else {
            System.out.println("File does not exist");
        }
    }
}
