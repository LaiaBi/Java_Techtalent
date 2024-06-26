package T19;
	import javax.swing.*;
	import java.awt.event.*;

	public class SaludoPersonalizado_01 extends JFrame {
	    
	    private JTextField textField;
	    
	    public SaludoPersonalizado_01() {
	        setTitle("CiberSaludo.exe");
	        setSize(400, 200);
	        setLocationRelativeTo(null);
	        setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        // Crear un panel
	        JPanel panel = new JPanel();
	        panel.setLayout(null);
	        setContentPane(panel);
	        
	        
	        
	        // Insertar texto para el nombre
			JLabel etiqueta = new JLabel("¿Quien eres?");
			etiqueta.setBounds(90,70,120,20);
			panel.add(etiqueta);

	        // Crear un campo de texto
	        textField = new JTextField(20);
	        
	        //Coord. texto
	        textField.setBounds(60,100,150,20);
	        panel.add(textField);
	        
	        // Crear un botón
	        JButton botonSaludar = new JButton("Saludar");
	        botonSaludar.setBounds(220,100,110,20);
	        panel.add(botonSaludar);
	        
	        // Agregar ActionListener al botón
	        botonSaludar.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // Obtener el texto del campo de texto
	                String nombre = textField.getText();
	                // Mostrar un mensaje en un JOptionPane
	                JOptionPane.showMessageDialog(SaludoPersonalizado_01.this, "¡Hola " + nombre + "!");
	            }
	        });
	        panel.add(botonSaludar);
	        
	        // Agregar el panel a la ventana
	        add(panel);
	    }
	    
	    public static void main(String[] args) {
	        // Crear una instancia de la ventana
	        SaludoPersonalizado_01 ventana = new SaludoPersonalizado_01();
	        // Hacer visible la ventana
	        ventana.setVisible(true);
	    }
	}
