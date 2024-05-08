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
        textField.setBounds(60,100,150,20);
        panel.add(textField);
     
     // Crear un botón
        JButton botonOk = new JButton("OK");
        botonOk.setBounds(100,200,110,20);
        panel.add(botonOk);
        
     
        
    }
}
