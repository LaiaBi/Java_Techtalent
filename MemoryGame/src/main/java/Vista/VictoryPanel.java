package Vista;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class VictoryPanel extends JPanel {

    public VictoryPanel(String victoryImagePath, String victorySoundPath) {
        setLayout(new BorderLayout());

        JLabel victoryLabel = new JLabel("¡Felicidades, ganaste!", SwingConstants.CENTER);
        victoryLabel.setFont(new Font("Serif", Font.BOLD, 24));

        JLabel victoryImage = new JLabel(new ImageIcon(victoryImagePath));

        add(victoryLabel, BorderLayout.NORTH);
        add(victoryImage, BorderLayout.CENTER);

        playVictorySound(victorySoundPath);
    }

    private void playVictorySound(String soundPath) {
        try {
            File soundFile = new File(soundPath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}

