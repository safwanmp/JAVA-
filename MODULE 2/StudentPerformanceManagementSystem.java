import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class StudentPerformanceManagementSystem extends Frame implements ActionListener {
    TextField nameField, subjectField, markField;
    Button calculateButton;
    TextArea outputArea;

    public StudentPerformanceManagementSystem() {
        super("Student Performance Management System");
        setLayout(new FlowLayout());
        add(new Label("Name: "));
        nameField = new TextField(20);
        add(nameField);
        add(new Label("Subject: "));
        subjectField = new TextField(20);
        add(subjectField);
        add(new Label("Marks: "));
        markField = new TextField(10);
        add(markField);
        calculateButton = new Button("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);
        outputArea = new TextArea(8, 30);
        add(outputArea);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setSize(360, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            String name = nameField.getText();
            String subject = subjectField.getText();
            double marks = Double.parseDouble(markField.getText());
            double total = marks;
            double average = total;
            outputArea.setText("Name: " + name + "\nSubject: " + subject + "\nMarks: " + marks + "\nTotal: " + total + "\nAverage: " + average);
        }
    }

    public static void main(String[] args) {
        new StudentPerformanceManagementSystem();
    }
}
