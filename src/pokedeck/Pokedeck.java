package pokedeck;

import java.util.ArrayList;

public class Pokedeck {
	private ArrayList<Card> cardList = new ArrayList<Card>();

	public void addNewCard(Card pokemon) {
		this.cardList.add(pokemon);
	}

	public void deletCard(int index) {
		this.cardList.remove(index);
	}

	public Card getCardByNumber(int number) {
		Card neededCard = null;
		for (Card card : this.cardList) {
			if (card.getNumber() == number) {
				neededCard = card;
			}
		}
		return neededCard;
	}

	public Card getCardByName(String name) {
		Card neededCard = null;
		for (Card card : this.cardList) {
			if (card.getName() == name) {
				neededCard = card;
			}
		}
		return neededCard;
	}
	public ArrayList<Card> getCardList(){
		return this.cardList;
		
	}
}
