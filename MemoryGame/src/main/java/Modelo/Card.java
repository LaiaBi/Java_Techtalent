package Modelo;

public class Card {
    private int id;
    private boolean isMatched;
    private boolean isFaceUp;
    private String imagePath;

    public Card(int id, String imagePath) {
        this.id = id;
        this.isMatched = false;
        this.isFaceUp = false;
        this.imagePath = imagePath;
    }

    public int getId() {
        return id;
    }

    public boolean isMatched() {
        return isMatched;
    }

    public void setMatched(boolean matched) {
        isMatched = matched;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void setFaceUp(boolean faceUp) {
        isFaceUp = faceUp;
    }

    public String getImagePath() {
        return imagePath;
    }
}