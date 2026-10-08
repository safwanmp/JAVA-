import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.Timer;

public class AnimationApplet extends JFrame {
    private int x = 10;

    public AnimationApplet() {
        setTitle("Animation Demo");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Timer timer = new Timer(100, e -> {
            x += 5;
            if (x > 250) {
                x = 10;
            }
            repaint();
        });
        timer.start();
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.fillOval(x, 50, 40, 40);
    }

    public static void main(String[] args) {
        new AnimationApplet();
    }
}
