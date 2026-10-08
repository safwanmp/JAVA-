import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HtmlParameterApplet extends JFrame {
    private final String message;
    private final Color bgColor;
    private final Color fgColor;

    public HtmlParameterApplet(String message, String bg, String fg) {
        this.message = message;
        this.bgColor = bg != null ? Color.decode(bg) : Color.WHITE;
        this.fgColor = fg != null ? Color.decode(fg) : Color.BLACK;
        setTitle("HTML Parameter Demo");
        setLayout(new FlowLayout());
        add(new JLabel(message));
        setBackground(bgColor);
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(fgColor);
        g.drawString(message, 20, 50);
    }

    public static void main(String[] args) {
        String message = args.length > 0 ? args[0] : "Welcome";
        String bg = args.length > 1 ? args[1] : "#FFFFFF";
        String fg = args.length > 2 ? args[2] : "#000000";
        new HtmlParameterApplet(message, bg, fg);
    }
}
