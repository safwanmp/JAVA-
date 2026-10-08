import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseKeyboardAdapterFrame extends Frame {
    int x = 50, y = 50;
    String message = "Click or press a key";

    public MouseKeyboardAdapterFrame() {
        super("Mouse and Keyboard Events");
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                message = "Mouse clicked at (" + x + ", " + y + ")";
                repaint();
            }
        });
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                message = "Key pressed: " + e.getKeyChar();
                repaint();
            }
        });
        setSize(300, 200);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString(message, x, y);
    }

    public static void main(String[] args) {
        new MouseKeyboardAdapterFrame();
    }
}
