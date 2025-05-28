import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxExample extends JFrame{
    private JPanel JPanel1;
    private JComboBox comboBox1;
    private JButton OKButton;
    private JLabel showText;

    ComboBoxExample(){
        super("Menu");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width, height);

        this.setVisible(true);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "Wybrano: " +comboBox1.getItemAt(comboBox1.getSelectedIndex());
                showText.setText(text);
            }
        });
    }
}
