package T19;

import javax.swing.*;
import java.awt.event.*;

public class ListaPelis extends JFrame { 
	private JTextField textField;
    
    public ListaPelis() {
        setTitle("Cine_Clandestino.exe");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
     // Crear un panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        setContentPane(panel);
        
     // Insertar texto para la accion
        JLabel etiqueta = new JLabel("¿Que memorizo?");
     	etiqueta.setBounds(90,70,120,20);
     	panel.add(etiqueta);
     	
     // Crear un campo de texto
        textField = new JTextField(20);    
     //Coord. texto
        textField.setBounds(60,100,159,20);
        panel.add(textField);
     
     // Crear un botón
        JButton botonOk = new JButton("OK");
        botonOk.setBounds(85,150,110,20);
        panel.add(botonOk);
    
     // Insertar texto para la accion
        JLabel memoria = new JLabel("Recuerdo:");
     	memoria.setBounds(350,70,120,20);
     	panel.add(memoria);
      // Crear un menú seleccion
     	JComboBox Peli= new JComboBox<> ();
     	Peli.setBounds(300,100,170,20);
     	panel.add(Peli);

    // Agregar ActionListener al botón
    	botonOk.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
    // Obtener el texto del campo de texto
        String nombre = textField.getText();
        Peli.addItem(nombre);
        }
    });
 
    panel.add(memoria);
    
    // Agregar el panel a la ventana
    add(panel);
		
    	}
     	 public static void main(String[] args) {
 	        // Crear una instancia de la ventana
 	        ListaPelis ventana = new ListaPelis();
 	        // Hacer visible la ventana
 	        ventana.setVisible(true); 
     
     	 }
    	}
  


