import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WyswietlStudentow extends JFrame {
    private JPanel JPanel1;
    private JButton usuńButton;
    private JButton edytujButton;
    private JButton wsteczButton;
    private JTable table1;
    private JButton szukajButton;
    private JTextField szukajJTF;

    // Dane przykładowe studentów
    private String[] columnNames = {"Imię", "Nazwisko", "Kierunek", "Semestr"};
    private Object[][] data = {
            {"Anna", "Kowalska", "Informatyka", "3"},
            {"Jan", "Nowak", "Automatyka", "2"},
            {"Ewa", "Wiśniewska", "Matematyka", "4"}
    };


    public WyswietlStudentow() {
        super("Lista studentow");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width, height);
        this.setLocationRelativeTo(null);


        // Tworzenie modelu tabeli

        table1.setModel(model);
        table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        this.setVisible(true);
        wsteczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ZarzadzanieStudentami z = new ZarzadzanieStudentami();
                dispose();
            }
        });
    }
}
