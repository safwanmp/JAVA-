import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AppletLifeCycle extends JFrame {
    private final JLabel statusLabel = new JLabel("Lifecycle status");

    public AppletLifeCycle() {
        setTitle("Applet Lifecycle");
        setLayout(new FlowLayout());
        add(statusLabel);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);
        statusLabel.setText("init(), start(), paint(), stop(), destroy() lifecycle");
    }

    public static void main(String[] args) {
        new AppletLifeCycle();
    }
}
