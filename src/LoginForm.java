import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField loginLbl;
    private JPasswordField passwordField1;
    private JButton closeButton;
    private JButton loginButton;
    private JPanel JPanel1;

    String user = "admin", pass = "admin";


    public LoginForm() {
        super("Login");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width, height);


        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = loginLbl.getText();
                String pass = new String(passwordField1.getPassword());
                if(user.equals("admin") && pass.equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Welcome Admin", "Welcome Admin", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    //otwarcie nowego okna
                    MenuForm menuForm = new MenuForm();
                    menuForm.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid user or password","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }






}
