package Modelo;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Board {
    private List<Card> cards;

    public Board(int pairs, List<String> imagePaths) {
        cards = new ArrayList<>();
        for (int i = 0; i < pairs; i++) {
            cards.add(new Card(i, imagePaths.get(i)));
            cards.add(new Card(i, imagePaths.get(i)));
        }
        Collections.shuffle(cards);
    }

    public List<Card> getCards() {
        return cards;
    }

    public Card getCardAt(int index) {
        return cards.get(index);
    }

    public boolean checkMatch(int firstIndex, int secondIndex) {
        if (cards.get(firstIndex).getId() == cards.get(secondIndex).getId()) {
            cards.get(firstIndex).setMatched(true);
            cards.get(secondIndex).setMatched(true);
            return true;
        }
        return false;
    }

    public boolean allMatched() {
        for (Card card : cards) {
            if (!card.isMatched()) {
                return false;
            }
        }
        return true;
    }
}