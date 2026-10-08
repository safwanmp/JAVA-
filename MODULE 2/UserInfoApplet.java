import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UserInfoApplet extends JFrame {
    public UserInfoApplet() {
        setTitle("Student Information");
        setLayout(new FlowLayout());
        String name = "Asha";
        String registerNo = "101";
        String course = "BCA";
        String semester = "III";
        add(new JLabel("Name: " + name));
        add(new JLabel("Register No: " + registerNo));
        add(new JLabel("Course: " + course));
        add(new JLabel("Semester: " + semester));
        setSize(260, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UserInfoApplet();
    }
}
