import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EmployeeDataStream {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("employees.dat"))) {
            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(25000.0);
            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(30000.0);
        } catch (IOException e) {
            System.out.println("Error writing employees: " + e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("employees.dat"))) {
            while (dis.available() > 0) {
                int id = dis.readInt();
                String name = dis.readUTF();
                double salary = dis.readDouble();
                System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
            }
        } catch (IOException e) {
            System.out.println("Error reading employees: " + e.getMessage());
        }
    }
}
