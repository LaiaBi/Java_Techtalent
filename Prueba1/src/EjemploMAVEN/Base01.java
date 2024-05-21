package EjemploMAVEN;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Base01 {
	private JPanel cp;
	private String so;
	private String[] especialidad;
	private int horas;

	public Base01 () {
		this.so = "";
		this.especialidad = new String[3];
		this.horas = 0;

		setTitle("Proto_tipo");
		setSize(235, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		// Panel
		cp = new JPanel();
		cp.setLayout(null);
		setContentPane(cp);

		// Label
		JLabel label1 = new JLabel("Sistema Operativo favorito");
		label1.setBounds(35, 10, 155, 20);
		cp.add(label1);

		// RadioButtons
		JRadioButton radioButton1 = new JRadioButton("Windows", false);
		radioButton1.setBounds(30, 35, 109, 23);
		cp.add(radioButton1);

		JRadioButton radioButton2 = new JRadioButton("Linux", false);
		radioButton2.setBounds(30, 60, 109, 23);
		cp.add(radioButton2);

		JRadioButton radioButton3 = new JRadioButton("Mac", false);
		radioButton3.setBounds(30, 85, 109, 23);
		cp.add(radioButton3);

		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(radioButton1);
		bgroup.add(radioButton2);
		bgroup.add(radioButton3);

		// Change Listener
		ChangeListener cl = new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				label4.setText(Integer.toString(sl.getValue()));
			}

		};

		sl.addChangeListener(cl);

		// Button
		JButton b = new JButton("Enviar");
		b.setBounds(55, 310, 80, 20);
		cp.add(b);

		// Action Listener
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				boolean radioSelected = true;
				if (radioButton1.isSelected()) {
					so = radioButton1.getText();
				} else if (radioButton2.isSelected()) {
					so = radioButton2.getText();
				} else if (radioButton3.isSelected()) {
					so = radioButton3.getText();
				} else {
					radioSelected = false;
				}
				if (radioSelected) {
					if (check1.isSelected()) {
						especialidad[0] = check1.getText();
					}
					if (check2.isSelected()) {
						especialidad[1] = check2.getText();
					}
					if (check3.isSelected()) {
						especialidad[2] = check3.getText();
					}

					horas = sl.getValue();

					String respuesta = "Sistema operativo favorito: " + so + "\nEspecialidad";

					int countNulls = 0;
					String especialidades = "";
					for (int i = 0; i < especialidad.length; i++) {
						if (especialidad[i] == null) {
							countNulls++;
						} else {
							especialidades += especialidad[i] + " ";
						}
					}

					if (countNulls == 3) {
						respuesta += ": Ninguna";
					} else if (countNulls <= 1) {
						respuesta += "es: ";
					} else {
						respuesta += ": ";
					}

					respuesta += especialidades + "\nHoras dedicadas al pc: " + horas;

					JOptionPane.showMessageDialog(null, respuesta);
				} else {
					JOptionPane.showMessageDialog(null, "Debes indicar tu sistema operativo favorito");
				}

			}

		};

		b.addActionListener(al);

	}
	public static void main(String[] args) {
	        // Crear una instancia de la ventana
	        Preguntame ventana = new Preguntame();
	        // Hacer visible la ventana
	        ventana.setVisible(true); 
 
 	 }
}

