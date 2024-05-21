package Proyecto1.Nuestroproyecto;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Tortilla extends JFrame{
	private JPanel contentPane = new JPanel();
	private JButton boton1;
	private JButton boton2;
	private JLabel texto;

	public Tortilla() {
		setTitle("La GRAN pregunta ...");
		setSize(400, 300);
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		// Para poder centrar las cosas
		contentPane.setLayout(new FlowLayout());
		setContentPane(contentPane);

		texto = new JLabel("");
		contentPane.add(texto);

		boton1 = new JButton("Tortilla SIN cebolla");
		contentPane.add(boton1);

		boton2 = new JButton("Tortilla CON cebolla");
		contentPane.add(boton2);

		setVisible(true);

		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText("Tortilla CON cebolla");
			}
		});

		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				texto.setText("Tortilla SIN cebolla");
			}
		});

	}

	public static void main(String[] args) {

		Tortilla app = new Tortilla();
	}

}

