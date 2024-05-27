package Vista;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class WelcomePanel extends JPanel {
    private JButton playButton;

    public WelcomePanel() {
        setLayout(new BorderLayout());

        JLabel welcomeLabel = new JLabel("Bienvenido al MEMORY", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Serif", Font.BOLD, 24));

        playButton = new JButton("Play");

        add(welcomeLabel, BorderLayout.CENTER);
        add(playButton, BorderLayout.SOUTH);
    }

    public void setPlayButtonListener(ActionListener listener) {
        playButton.addActionListener(listener);
    }
}