package main;

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

	public boolean isExistingCard(Card card) {
		boolean result;
		if (card == null) {
			result = false;
		} else {
			result = true;
		}

		return result;
	}
	public void display(Card card){
		HashMap<String,String> list = card.display();
		Set<Map.Entry<String, String>> set = list.entrySet();
		for(Map.Entry<String, String> me : set){
			System.out.println(me.getKey() + " : " + me.getValue());
		}
	}

	public void savePokedeck(){
	}
//		File file = new File("save.txt");
//
//		try {
//			if (!file.exists()) {
//				file.createNewFile();
//			}
//			FileOutputStream fos = new FileOutputStream(new File("save.txt"),
//					false);
//			static Element racine = new Element("personnes");
//			ByteArrayOutputStream b = new ByteArrayOutputStream();
//			ObjectOutputStream objectOutput = new ObjectOutputStream(b);
//			
//			
//			for (Pokemon pokemon : this.pokedeck.getCardList()) {
//				pokemon.getMap();
//				//objectOutput.close();
//				byte[] bytes =  b.toByteArray();
//				
//				for(byte bit : bytes){
//					fos.write(bit);
////					fos.flush();
////					fos.close();
//				}
//			}
//			


//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
}
