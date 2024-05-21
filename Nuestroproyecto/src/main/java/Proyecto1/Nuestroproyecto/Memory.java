package Proyecto1.Nuestroproyecto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Memory {
	//NUM. FILAS
	private static final int ROWS = 4;
	// NUM. COLUMNAS
    private static final int COLS = 4; 
    // NUM. CARTAS
    private static final int NUM_CARDS = ROWS * COLS;

    public static void main(String[] args) {
        JFrame frame = new JFrame("RECUERDOS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
     // Crear GridLayout con 4 filas y 4 columnas
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(ROWS, COLS));

        // Crear botones para representar las cartas
        JButton[] cards = new JButton[NUM_CARDS];
        for (int i = 0; i < NUM_CARDS; i++) {
            cards[i] = new JButton("Card " + (i + 1));
            //CATIOPNLIST a las cartas
            cards[i].addActionListener(new CardClickListener());
            //AÑADIR cartas al panel
            panel.add(cards[i]);
        }

        frame.add(panel);
        frame.setVisible(true);
    }

    // Clase interna para manejar el evento de clic en las cartas
    private static class CardClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            // Acción de ejemplo al hacer clic en la carta
            button.setText("OK"); 
        }
    }
}