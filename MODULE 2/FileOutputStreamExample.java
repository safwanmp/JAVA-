import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String text = "Java file output example\n";
        try (FileOutputStream fos = new FileOutputStream("output.txt", true)) {
            fos.write(text.getBytes());
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
