import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DodawanieStudentow extends JFrame {
    private JPanel JPanel1;
    private JTextField numerAlbumuJTF;
    private JTextField imieJTF;
    private JTextField nazwiskoJTF;
    private JComboBox kierunekComboBox;
    private JButton zapiszButton;
    private JButton wsteczButton;

    private String imie;
    private String nazwisko;
    private String kierunek;
    private String nrAlbumu;


    public DodawanieStudentow() {
        super("Dodawanie Studentow");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width, height);
        this.setLocationRelativeTo(null);

        this.setVisible(true);
        wsteczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ZarzadzanieStudentami z = new ZarzadzanieStudentami();
                dispose();
            }
        });
        zapiszButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             if (numerAlbumuJTF.getText().isEmpty() || imieJTF.getText().isEmpty() || nazwiskoJTF.getText().isEmpty()) {
                 JOptionPane.showMessageDialog(null, "Nie podano wszystkich danych!","Błąd",JOptionPane.ERROR_MESSAGE);
             }
             try {
                 nrAlbumu = numerAlbumuJTF.getText();
                 nazwisko = nazwiskoJTF.getText();
                 imie = imieJTF.getText();
                 kierunek = kierunekComboBox.getItemAt(kierunekComboBox.getSelectedIndex()).toString();
                 dispose();
             } catch (NumberFormatException ex) {
                 JOptionPane.showMessageDialog(null, "Wystąpił błąd: " + ex.getMessage(),"Błąd",JOptionPane.ERROR_MESSAGE);
             }
            }
        });
    }
}
