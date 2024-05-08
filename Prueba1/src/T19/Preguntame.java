package T19;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
public class Preguntame extends JFrame{
	
		private JTextField textField;
	    
	    public Preguntame() {
	        setTitle("Pregunta_me.exe");
	        setSize(400, 200);
	        setLocationRelativeTo(null);
	        setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	     // Crear un panel
	        JPanel panel = new JPanel();
	        panel.setLayout(null);
	        setContentPane(panel);
	        
	     // Insertar texto para la accion
	        JLabel etiqueta = new JLabel("Elige un sistema operativo:");
	     	etiqueta.setBounds(20,20,160,20);
	     	panel.add(etiqueta);
	    }
	    // JRadioButton
	    JFrame frame = new JFrame("RadioButton Example");

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
	// Insertar texto para la accion
		JLabel etiqueta = new JLabel("Especialidad:");
		etiqueta.setBounds(100,20,160,20);
		panel.add(etiqueta);
	//

      
    public static void main(String[] args) {
        // Crear una instancia de la ventana
        Preguntame ventana = new Preguntame();
        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}