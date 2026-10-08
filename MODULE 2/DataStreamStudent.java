import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamStudent {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.dat"))) {
            dos.writeInt(101);
            dos.writeUTF("Asha");
            dos.writeDouble(92.5);
        } catch (IOException e) {
            System.out.println("Error writing student data: " + e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("student.dat"))) {
            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double marks = dis.readDouble();
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }
    }
}
