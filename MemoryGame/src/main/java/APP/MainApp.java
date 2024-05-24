package APP;

import Controlador.MemoryGameController;
import Vista.MemoryGameView;

public class MainApp {
    public static void main(String[] args) {
        MemoryGameView view = new MemoryGameView();
        new MemoryGameController(view);

        view.setVisible(true);
    }
}