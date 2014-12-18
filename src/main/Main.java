package main;


import java.util.ArrayList;
import java.util.HashMap;

import pokedeck.Capacity;
import pokedeck.EnergyType;
import pokedeck.Pokedeck;
import pokedeck.Pokemon;
import pokedeck.Card;
import ui.MainInterface;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Capacity> capacity = new ArrayList<Capacity>();
		HashMap<EnergyType, Integer> cost = new HashMap();
		
		cost.put(EnergyType.grass, 2);
		cost.put(EnergyType.colorless, 5);
		capacity.add(new Capacity("Leech Seed",cost,20,"Unless all damage from this attack is prevented, you may remove one damage counter from"));
		
		Pokedeck pokedeck = new Pokedeck();
		Pokemon Bulbasaur = new Pokemon("Bulbasaur", 44, EnergyType.grass,capacity,40,1,"A strange seed was planted on its back at birth. Thus, a plant sprouted and now grows with this Pok�mon");
		Pokemon Bolb = new Pokemon("Bolb");
		Menu menu = new Menu(pokedeck);
		menu.addCardToPokedeck(Bulbasaur);
		menu.addCardToPokedeck(Bolb);
		
		Pokemon monBulbi = (Pokemon) menu.getCardByNumber(44);
		ArrayList<Capacity> capa = monBulbi.getCapacitys();
		//menu.display(monBulbi);
		//System.out.println(capa.get(0).getCost());
		//System.out.println(monBulbi.getDescription());
		//menu.savePokedeck();
                MainInterface ui = new MainInterface();
                ui.index();
	}

}
