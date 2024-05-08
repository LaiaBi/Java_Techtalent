package T19;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ComponentsExample {
    private JFrame frame;
    private JPanel panel;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JCheckBox checkBox;
    private JSlider slider;
    private JLabel resultLabel;

    public ComponentsExample() {
        frame = new JFrame("Pregunta_me.exe");
        setSize(90, 60);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(50, 60));

        radioButton1 = new JRadioButton("Windows");
        radioButton2 = new JRadioButton("Linux");
       // radioButton3 = new JRadioButton("Mac");
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButton1);
        radioButtonGroup.add(radioButton2);
       // radioButtonGroup.add(radioButton3);

        checkBox = new JCheckBox("Casilla de verificación");

        slider = new JSlider(JSlider.HORIZONTAL, 1, 10, 1);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        resultLabel = new JLabel("Resultados:");

        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(checkBox);
        panel.add(slider);
        panel.add(resultLabel);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        addListeners();
    }

    private void setSize(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void addListeners() {
        radioButton1.addActionListener(e -> updateResults());
        radioButton2.addActionListener(e -> updateResults());
        checkBox.addActionListener(e -> updateResults());
        slider.addChangeListener(e -> updateResults());
    }

    private void updateResults() {
        String result = "Resultados:\n";
        if (radioButton1.isSelected()) {
            result += "Opción 1 seleccionada\n";
        }
        if (radioButton2.isSelected()) {
            result += "Opción 2 seleccionada\n";
        }
        if (checkBox.isSelected()) {
            result += "Casilla de verificación marcada\n";
        }
        result += "Valor del slider: " + slider.getValue();
        resultLabel.setText(result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ComponentsExample::new);
    }
}
