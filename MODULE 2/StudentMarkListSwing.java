import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class StudentMarkListSwing extends JFrame {
    JTextField nameField, regField, sub1Field, sub2Field, sub3Field;
    JButton calculateButton, clearButton, exitButton;
    JTextArea resultArea;

    public StudentMarkListSwing() {
        setTitle("Student Mark List");
        setLayout(null);
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(30, 30, 100, 20);
        add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(140, 30, 180, 20);
        add(nameField);

        JLabel regLabel = new JLabel("Register No");
        regLabel.setBounds(30, 60, 100, 20);
        add(regLabel);
        regField = new JTextField();
        regField.setBounds(140, 60, 180, 20);
        add(regField);

        JLabel s1Label = new JLabel("Subject 1");
        s1Label.setBounds(30, 90, 100, 20);
        add(s1Label);
        sub1Field = new JTextField();
        sub1Field.setBounds(140, 90, 180, 20);
        add(sub1Field);

        JLabel s2Label = new JLabel("Subject 2");
        s2Label.setBounds(30, 120, 100, 20);
        add(s2Label);
        sub2Field = new JTextField();
        sub2Field.setBounds(140, 120, 180, 20);
        add(sub2Field);

        JLabel s3Label = new JLabel("Subject 3");
        s3Label.setBounds(30, 150, 100, 20);
        add(s3Label);
        sub3Field = new JTextField();
        sub3Field.setBounds(140, 150, 180, 20);
        add(sub3Field);

        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(30, 190, 100, 30);
        add(calculateButton);
        clearButton = new JButton("Clear");
        clearButton.setBounds(140, 190, 100, 30);
        add(clearButton);
        exitButton = new JButton("Exit");
        exitButton.setBounds(250, 190, 100, 30);
        add(exitButton);

        resultArea = new JTextArea();
        resultArea.setBounds(30, 230, 320, 120);
        add(resultArea);

        calculateButton.addActionListener(e -> {
            try {
                double m1 = Double.parseDouble(sub1Field.getText());
                double m2 = Double.parseDouble(sub2Field.getText());
                double m3 = Double.parseDouble(sub3Field.getText());
                if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100) {
                    JOptionPane.showMessageDialog(this, "Marks must be between 0 and 100");
                    return;
                }
                double total = m1 + m2 + m3;
                double average = total / 3;
                String grade;
                if (average >= 90) grade = "A";
                else if (average >= 80) grade = "B";
                else if (average >= 70) grade = "C";
                else if (average >= 60) grade = "D";
                else grade = "F";
                resultArea.setText("Name: " + nameField.getText() + "\nRegister No: " + regField.getText() + "\nTotal: " + total + "\nAverage: " + average + "\nGrade: " + grade);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Enter valid marks");
            }
        });

        clearButton.addActionListener(e -> {
            nameField.setText("");
            regField.setText("");
            sub1Field.setText("");
            sub2Field.setText("");
            sub3Field.setText("");
            resultArea.setText("");
        });

        exitButton.addActionListener(e -> System.exit(0));

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentMarkListSwing();
    }
}
