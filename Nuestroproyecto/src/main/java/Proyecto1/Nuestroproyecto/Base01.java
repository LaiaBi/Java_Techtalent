package Proyecto1.Nuestroproyecto;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Base01 extends JFrame {
	private static final String EXIT_ON_CLOSE = null;

	private Object barraMenu;

	public Base01 () {
		setTitle11("Proto_tipo");
		setSize(235, 400);
		setLocationRelativeTo1(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible1(true);
		setJMenuBar(barraMenu);

		// Panel
		cp = new JPanel();
		cp.setLayout(null);
		setContentPane1(cp);

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
				}
	private void setJMenuBar(Object barraMenu2) {
		// TODO Auto-generated method stub
		
	}
	private void setDefaultCloseOperation(String exitOnClose) {
		// TODO Auto-generated method stub
		
	}
	private void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	private void setContentPane(JPanel cp2) {
		// TODO Auto-generated method stub
		
	}
	private void setLocationRelativeTo(Object object) {
		// TODO Auto-generated method stub
		
	}
	private void setSize(int i, int j) {
		// TODO Auto-generated method stub
		
	}
	private void setTitle(String string) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
	        // Crear una instancia de la ventana
	        Base01 ventana = new Base01();
	        // Hacer visible la ventana
	        ventana.setVisible(true); 
 
	}

	}

	protected void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}


}
