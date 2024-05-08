package T19;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
public class windousymas{
    public windousymas() {
        JFrame frame = new JFrame("RadioButton Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JRadioButton windowsButton = new JRadioButton("Windows");
        JRadioButton linuxButton = new JRadioButton("Linux");
        JRadioButton macButton = new JRadioButton("Mac");

        // Creamos un grupo para asegurar que solo se pueda seleccionar una opción a la vez
        ButtonGroup group = new ButtonGroup();
        group.add(windowsButton);
        group.add(linuxButton);
        group.add(macButton);

        panel.add(windowsButton);
        panel.add(linuxButton);
        panel.add(macButton);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new windousymas();
            }
        });
    }
}

