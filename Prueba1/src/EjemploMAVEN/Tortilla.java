package EjemploMAVEN;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Tortilla extends JFrame {
	protected AbstractButton textField;

	public class Main {
	    private static String lastButtonPressed = "Ninguno";

	    public static void main(String[] args) {
	        // Crear el marco principal
	        JFrame frame = new JFrame("Tortilla.exe");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 200);

	        // Crear el panel
	        JPanel panel = new JPanel();
	        frame.add(panel);
	        placeComponents(panel);

	        // Hacer visible el marco
	        frame.setVisible(true);
	    }

	    private static void placeComponents(JPanel panel) {
	        panel.setLayout(null);

	        // Crear botones
	        JButton button1 = new JButton("con cebolla");
	        button1.setBounds(50, 30, 120, 25);
	        panel.add(button1);

	        JButton button2 = new JButton("sin cebolla");
	        button2.setBounds(200, 30, 120, 25);
	        panel.add(button2);
	     // Añadir acción al botón 1
	        button1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                lastButtonPressed = "con cebolla";
	                JOptionPane.showMessageDialog(panel, "Tortilla con cebolla");
	            }
	        });

	        // Añadir acción al botón 2
	        button2.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                lastButtonPressed = "Sin cebolla";
	                JOptionPane.showMessageDialog(panel, "Tortilla sin cebolla");
	            }
	        });
	     // Crear una instancia de la ventana
	        Tortilla ventana = new Tortilla();
	        // Hacer visible la ventana
	        ventana.setVisible(true);
	    }
	}
}