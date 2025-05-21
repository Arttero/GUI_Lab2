import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckTask extends JFrame {
    private JPanel JPanel1;
    private JCheckBox javaCheckBox;
    private JCheckBox cCheckBox;
    private JCheckBox cppCheckBox;
    private JCheckBox pythonCheckBox;
    private JButton OKButton;

    private int price = 0;


    public CheckTask() {
        super("Zadanie 2");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 500, height = 400;
        this.setSize(width, height);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "Wybrane kursy:\n";
                if (javaCheckBox.isSelected()) {
                    message += "Java #price 3 500 PLN\n";
                    price += 3500;
                }
                if (cCheckBox.isSelected()) {
                    message += "C# price 3 000 PLN\n";
                    price += 3000;
                }
                if (cppCheckBox.isSelected()) {
                    message += "C# price 4 000 PLN\n";
                    price += 4000;
                }
                if (pythonCheckBox.isSelected()) {
                    message += "Python #price 5 000 PLN\n";
                    price += 5000;
                }
                message += "-------------------------------\n";
                JOptionPane.showMessageDialog(null, message+ " Razem: " + price + "PLN");
            }
        });
    }
}
