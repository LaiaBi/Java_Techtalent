package Equipo;
import javax.swing.*;

import T19.ListaPelis;

import java.awt.event.*;
public class pascalsCalculator extends JFrame{
private JTextField textField;
    
    public pascalsCalculator() {
        setTitle("Pascal's_Calculator.exe");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // Crear un panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        setContentPane(panel);
}
  
     	 public static void main(String[] args) {
 	        // Crear una instancia de la ventana
 	        ListaPelis ventana = new ListaPelis();
 	        // Hacer visible la ventana
 	        ventana.setVisible(true); 
     
     	 }
}