import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class StudentRegistrationForm extends Frame implements ActionListener {
    TextField nameField, regField;
    Choice courseChoice;
    Checkbox male, female;
    Button submit, clear;

    public StudentRegistrationForm() {
        super("Student Registration Form");
        Panel panel = new Panel(new FlowLayout());
        panel.add(new Label("Name: "));
        nameField = new TextField(20);
        panel.add(nameField);
        panel.add(new Label("Reg No: "));
        regField = new TextField(20);
        panel.add(regField);
        panel.add(new Label("Course: "));
        courseChoice = new Choice();
        courseChoice.add("BCA");
        courseChoice.add("BSc");
        courseChoice.add("BTech");
        panel.add(courseChoice);
        male = new Checkbox("Male");
        female = new Checkbox("Female");
        panel.add(male);
        panel.add(female);
        submit = new Button("Submit");
        clear = new Button("Clear");
        submit.addActionListener(this);
        clear.addActionListener(this);
        panel.add(submit);
        panel.add(clear);
        add(panel);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setSize(420, 220);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String gender = male.getState() ? "Male" : "Female";
            System.out.println("Name: " + nameField.getText());
            System.out.println("Reg No: " + regField.getText());
            System.out.println("Course: " + courseChoice.getSelectedItem());
            System.out.println("Gender: " + gender);
        } else if (e.getSource() == clear) {
            nameField.setText("");
            regField.setText("");
            courseChoice.select(0);
            male.setState(false);
            female.setState(false);
        }
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}
