import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioTask extends JFrame {
    private JPanel JPanel1;
    private JButton backButton;
    private JButton okButton;
    private JButton closeButton;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macintoshRadioButton;
    private JLabel IconView;

    private ImageIcon iconLinux = new ImageIcon(getClass().getResource("figures/icons8-linux-100.png"));
    private ImageIcon iconWin = new ImageIcon(getClass().getResource("figures/icons8-windows-100.png"));
    private ImageIcon iconMac = new ImageIcon(getClass().getResource("figures/icons8-apple-inc-100.png"));

    private static ImageIcon resize(ImageIcon src, int width, int height){
        return new ImageIcon(src.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
    }


    public RadioTask() {
        super("Zadanie 1");
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
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "";
                if(linuxRadioButton.isSelected()) text += "Linux";
                if(windowsRadioButton.isSelected()) text += "Windows";
                if(macintoshRadioButton.isSelected()) text += "Macintosh";


                JOptionPane.showMessageDialog(RadioTask.this, "Wybrano system: " + text);
            }
        });
        linuxRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(linuxRadioButton.isSelected()) {
                    IconView.setIcon(iconLinux);
                }
            }
        });
        windowsRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(windowsRadioButton.isSelected()) {
                    IconView.setIcon(iconWin);
                }
            }
        });
        macintoshRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(macintoshRadioButton.isSelected()) {
                    IconView.setIcon(iconMac);
                }
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MenuForm menuForm = new MenuForm();
                menuForm.setVisible(true);
            }
        });
    }
}
