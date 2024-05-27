package Controlador;

import Modelo.Board;
import Modelo.Card;
import Vista.MemoryGameView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MemoryGameController {
	private Board board;
	private MemoryGameView view;
	private int firstSelected = -1;
	private int secondSelected = -1;

	public MemoryGameController(MemoryGameView view) {
		this.view = view;
		this.view.showWelcomePanel(new PlayButtonListener());
	}

	class PlayButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int pairs = 8; // Número de pares
			board = new Board(pairs, Arrays.asList(
					"C:\\Users\\biosc\\OneDrive\\Escritorio\\Java_Techtalent\\MemoryGame\\src\\main\\java\\Imagenes\\ARFKM.png",
					"C:\\Users\\biosc\\OneDrive\\Escritorio\\Java_Techtalent\\MemoryGame\\src\\main\\java\\Imagenes\\FuckYeah.png",
					"C:\\Users\\biosc\\OneDrive\\Escritorio\\Java_Techtalent\\MemoryGame\\src\\main\\java\\Imagenes\\Lol.png",
					"C:\\Users\\biosc\\OneDrive\\Escritorio\\Java_Techtalent\\MemoryGame\\src\\main\\java\\Imagenes\\megusta.png",
					"C:\\Users\\biosc\\OneDrive\\Escritorio\\Java_Techtalent\\MemoryGame\\src\\main\\java\\Imagenes\\Pedobear.png",
					"C:\\Users\\biosc\\OneDrive\\Escritorio\\Java_Techtalent\\MemoryGame\\src\\main\\java\\Imagenes\\TrollFace.png",
					"C:\\Users\\biosc\\OneDrive\\Escritorio\\Java_Techtalent\\MemoryGame\\src\\main\\java\\Imagenes\\why.png",
					"C:\\Users\\biosc\\OneDrive\\Escritorio\\Java_Techtalent\\MemoryGame\\src\\main\\java\\Imagenes\\YaoMing.png"

			));
			view.showGamePanel(board);
			view.setButtonListener(new CardButtonListener());
		}
	}

	class CardButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int index = Integer.parseInt(e.getActionCommand());
			System.out.println(index);
			if (firstSelected == -1) {
				firstSelected = index;
				view.updateButton(index, board.getCardAt(index).getImagePath());
			} else if (secondSelected == -1) {
				secondSelected = index;
				view.updateButton(index, board.getCardAt(index).getImagePath());
				
				if (!board.checkMatch(firstSelected, secondSelected)) {
                    view.setStatus("No match, try again.");
                    Timer timer = new Timer(1000, new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							view.resetButton(firstSelected);
		                    view.resetButton(secondSelected);
		                    firstSelected = -1;
		                    secondSelected = -1;
							
						}
                    	
                    });
                    
                    timer.setRepeats(false);
    				timer.start();

                } else {
                    view.setStatus("Match found!");
                    firstSelected = -1;
                    secondSelected = -1;
                }

                if (board.allMatched()) {
                //    view.showVictoryPanel("");
                	 JOptionPane.showMessageDialog(null, "GG bro");
                }
				/*
				Timer timer = new Timer(2000, new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						if (!board.checkMatch(firstSelected, secondSelected)) {
							view.setStatus("No match, try again.");
							view.resetButton(firstSelected);
							view.resetButton(secondSelected);
						} else {
							view.setStatus("Match found!");
						}
						firstSelected = -1;
						secondSelected = -1;

						if (board.allMatched()) {
							// view.showVictoryPanel("");
							System.out.println("Bien Jugado");
						}
					}
				});
				*/
//				timer.setRepeats(false);
//				timer.start();
//				firstSelected = -1;
//				secondSelected = -1;
			}
		}
	}
}