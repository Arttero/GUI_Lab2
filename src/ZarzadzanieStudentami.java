import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZarzadzanieStudentami extends JFrame {
    private JPanel JPanel1;
    private JButton wyświetlStudentówButton;
    private JButton dodajNowegoStudentaButton;
    private JButton wyjścieButton;




    public ZarzadzanieStudentami() {
        super("Zarzadzanie studentami");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width, height);
        this.setLocationRelativeTo(null);

        this.setVisible(true);

        dodajNowegoStudentaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DodawanieStudentow nowyStudent = new DodawanieStudentow();
                dispose();
            }
        });
        wyświetlStudentówButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WyswietlStudentow wyswietl = new WyswietlStudentow();
                dispose();
            }
        });
        wyjścieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
