package T19;
import javax.swing.*;
import java.awt.event.*;
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
	    JPanel panel = new JPanel();
	    JRadioButton windowsButton = new JRadioButton("Windows");
        JRadioButton linuxButton = new JRadioButton("Linux");
        JRadioButton macButton = new JRadioButton("Mac");
        ButtonGroup group = new ButtonGroup();
      
    public static void main(String[] args) {
        // Crear una instancia de la ventana
        Preguntame ventana = new Preguntame();
        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}