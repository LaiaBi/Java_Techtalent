package Vista;


import Modelo.Board;
import Util.ImageUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MemoryGameView extends JFrame {
    private JButton[] cardButtons;
    private JLabel statusLabel;
    private ImageIcon cardBackImage;
    private int cardWidth = 100; // Ajusta el tamaño del ancho de la carta
    private int cardHeight = 100; // Ajusta el tamaño del alto de la carta

    public MemoryGameView() {
        setTitle("Memory Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(600, 600);
    }

    public void showWelcomePanel(ActionListener playButtonListener) {
        WelcomePanel welcomePanel = new WelcomePanel();
        welcomePanel.setPlayButtonListener(playButtonListener);
        setContentPane(welcomePanel);
        revalidate();
    }

    public void showGamePanel(Board board) {
        cardBackImage = ImageUtil.resizeImage("C:\\Users\\Santos\\Desktop\\RepositoriTechTalent\\MemoryGrupal\\src\\main\\java\\Imagenes\\Dorso.png", cardWidth, cardHeight);
        JPanel cardPanel = new JPanel(new GridLayout(4, board.getCards().size() / 4));
        cardButtons = new JButton[board.getCards().size()];

        for (int i = 0; i < cardButtons.length; i++) {
            cardButtons[i] = new JButton(cardBackImage);
            cardButtons[i].setActionCommand(String.valueOf(i));
            cardPanel.add(cardButtons[i]);
        }

        statusLabel = new JLabel("Welcome to Memory Game");
        add(statusLabel, BorderLayout.SOUTH);
        add(cardPanel, BorderLayout.CENTER);
        setContentPane(cardPanel);
        revalidate();
    }

    public void setButtonListener(ActionListener listener) {
        for (JButton button : cardButtons) {
            button.addActionListener(listener);
        }
    }

    public JButton getButton(int index) {
        return cardButtons[index];
    }

    public void updateButton(int index, String imagePath) {
        cardButtons[index].setIcon(ImageUtil.resizeImage(imagePath, cardWidth, cardHeight));
    }

    public void resetButton(int index) {
        cardButtons[index].setIcon(cardBackImage);
    }

    public void setStatus(String text) {
        statusLabel.setText(text);
    }
}