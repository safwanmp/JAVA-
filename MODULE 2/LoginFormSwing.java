import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFormSwing extends JFrame {
    JTextField usernameField;
    JPasswordField passwordField;

    public LoginFormSwing() {
        setTitle("Login Form");
        setLayout(null);
        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(30, 30, 100, 20);
        add(usernameLabel);
        usernameField = new JTextField();
        usernameField.setBounds(140, 30, 150, 25);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(30, 70, 100, 20);
        add(passwordLabel);
        passwordField = new JPasswordField();
        passwordField.setBounds(140, 70, 150, 25);
        add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(30, 120, 100, 30);
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            if (username.equals("admin") && password.equals("admin123")) {
                JOptionPane.showMessageDialog(this, "Login successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password");
            }
        });
        add(loginButton);

        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(140, 120, 100, 30);
        resetButton.addActionListener(e -> {
            usernameField.setText("");
            passwordField.setText("");
        });
        add(resetButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(250, 120, 100, 30);
        exitButton.addActionListener(e -> System.exit(0));
        add(exitButton);

        setSize(400, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFormSwing();
    }
}
