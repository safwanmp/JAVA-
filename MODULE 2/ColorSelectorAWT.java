import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSelectorAWT extends Frame implements ActionListener {
    Button red, green, blue;
    Panel panel;

    public ColorSelectorAWT() {
        super("Color Selector");
        setLayout(new FlowLayout());
        panel = new Panel();
        panel.setBackground(Color.WHITE);
        red = new Button("Red");
        green = new Button("Green");
        blue = new Button("Blue");
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        add(red);
        add(green);
        add(blue);
        add(panel);
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red) panel.setBackground(Color.RED);
        else if (e.getSource() == green) panel.setBackground(Color.GREEN);
        else if (e.getSource() == blue) panel.setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        new ColorSelectorAWT();
    }
}
