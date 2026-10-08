import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventApplet extends JFrame {
    private String message = "Move the mouse inside the window";

    public MouseEventApplet() {
        setTitle("Mouse Event Demo");
        setLayout(new FlowLayout());
        JLabel label = new JLabel(message);
        add(label);
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                message = "Clicked at x = " + e.getX() + ", y = " + e.getY();
                label.setText(message);
                repaint();
            }
        });
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEventApplet();
    }
}
