package Proyecto1.Nuestroproyecto;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Tortillados extends JFrame {
	private JPanel contentPane = new JPanel();
	private JButton boton1;
	private JButton boton2;
	private JLabel texto1;
	private JLabel texto2;
	private int contador1 = 0;
	private int contador2 = 0;

	public Tortillados() {
		setTitle("La GRAN pregunta ...");
		setSize(250, 300);
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 

		contentPane.setLayout(new FlowLayout());
		setContentPane(contentPane);

		texto1 = new JLabel("AZUL: " + contador1 + " veces");
		contentPane.add(texto1);

		texto2 = new JLabel("ROJO: " + contador2 + " veces");
		contentPane.add(texto2);

		boton1 = new JButton("AZUL");
		contentPane.add(boton1);

		boton2 = new JButton("ROJO");
		contentPane.add(boton2);

		setVisible(true);

		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador1++;
				texto1.setText("AZUL: " + contador1 + " veces");
			}
		});

		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador2++;
				texto2.setText("ROJO: " + contador2 + " veces");
			}
		});
	}

	public static void main(String[] args) {

		Tortillados app = new Tortillados();

	}

}
