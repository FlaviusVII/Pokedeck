package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import pokedeck.Card;
import pokedeck.Pokedeck;

public class Menu {

    private Pokedeck pokedeck;

    public Menu(Pokedeck pokedeck) {
        this.pokedeck = pokedeck;
        
    }

    public Card getCardByNumber(int number) {

        return this.pokedeck.getCardByNumber(number);
    }

    public Card getCardByName(String name) {
        return this.pokedeck.getCardByName(name);
    }

    public void EditCardDescription(Card card, String description) {
        card.setDescription(description);
    }

    public void addCardToPokedeck(Card carte) {
        this.pokedeck.addNewCard(carte);
    }

    public void display(Card card) {
        HashMap<String, String> list = card.display();
        Set<Map.Entry<String, String>> set = list.entrySet();
        for (Map.Entry<String, String> me : set) {
            System.out.println(me.getKey() + " : " + me.getValue());
        }
    }

    public void savePokedeck() {
        SaveDeck save = new SaveDeck();
        save.save();
    }
}
