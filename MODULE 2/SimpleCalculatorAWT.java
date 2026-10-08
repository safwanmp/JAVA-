import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculatorAWT extends Frame implements ActionListener {
    TextField t1, t2, t3;
    Button add, sub, mul, div;

    public SimpleCalculatorAWT() {
        super("Simple Calculator");
        setLayout(new FlowLayout());
        add(new Label("Number 1: "));
        t1 = new TextField(10);
        add(t1);
        add(new Label("Number 2: "));
        t2 = new TextField(10);
        add(t2);
        add(new Label("Result: "));
        t3 = new TextField(10);
        t3.setEditable(false);
        add(t3);
        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");
        add(add);
        add(sub);
        add(mul);
        add(div);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            if (e.getSource() == add) t3.setText(String.valueOf(a + b));
            else if (e.getSource() == sub) t3.setText(String.valueOf(a - b));
            else if (e.getSource() == mul) t3.setText(String.valueOf(a * b));
            else if (b == 0) t3.setText("Error");
            else t3.setText(String.valueOf(a / b));
        } catch (NumberFormatException ex) {
            t3.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculatorAWT();
    }
}
