package File_Handling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NewFile {
    public static void main(String[] args) {
        String fileName = "File.txt";
        String searchString = "sample";
        String replacementString = "example";

        try {
            // Read the content of the file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            // Replace the word
            String modifiedContent = content.toString().replaceAll(searchString, replacementString);
            System.out.println(modifiedContent);
            // Write the modified content back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(modifiedContent);
            writer.close();

            System.out.println("Word replaced successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("File.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
