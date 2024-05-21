package Proyecto1.Nuestroproyecto;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


	public class Base01 extends JFrame {
		private JPanel contentPane = new JPanel();
		private JLabel campo;
		private JSlider slider;

		public Base01() {

			setTitle("Proto_tipo");
			setSize(400, 300);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);

			//Para poder centrar las cosas
			contentPane.setLayout(new FlowLayout());
			setContentPane(contentPane);

			campo = new JLabel("Basic");
			contentPane.add(campo, BorderLayout.CENTER);

			//Slider para cambiar el tamaño de la etiqueta
			slider = new JSlider(JSlider.HORIZONTAL, 10, 100, 20);
			slider.setMajorTickSpacing(10);
//			slider.setPaintTicks(true);
//			slider.setPaintLabels(true);

			//Accion para cambiar el tamaño de la etiqueta
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					int size = slider.getValue();
					campo.setFont(new Font("Arial", Font.PLAIN, size));
				}
			});

			contentPane.add(slider);

			setVisible(true);

		}

		public static void main(String[] args) {
			Base01 ventana = new Base01();
		}
	}