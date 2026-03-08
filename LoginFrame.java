import javax.swing.*;

public class LoginFrame extends JFrame {

    JTextField userField;
    JPasswordField passField;

    public LoginFrame() {

        setTitle("Admin Login");
        setSize(300,200);
        setLayout(null);

        JLabel user = new JLabel("Username:");
        user.setBounds(30,30,80,25);
        add(user);

        userField = new JTextField();
        userField.setBounds(120,30,120,25);
        add(userField);

        JLabel pass = new JLabel("Password:");
        pass.setBounds(30,70,80,25);
        add(pass);

        passField = new JPasswordField();
        passField.setBounds(120,70,120,25);
        add(passField);

        JButton login = new JButton("Login");
        login.setBounds(100,110,80,30);
        add(login);

        login.addActionListener(e -> checkLogin());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void checkLogin() {

        String user = userField.getText();
        String pass = new String(passField.getPassword());

        if(user.equals("admin") && pass.equals("1234")) {

            new DashboardFrame().setVisible(true);
            dispose();

        } else {
            JOptionPane.showMessageDialog(this,"Invalid Login");
        }
    }

    public static void main(String[] args) {
        new LoginFrame().setVisible(true);
    }
}