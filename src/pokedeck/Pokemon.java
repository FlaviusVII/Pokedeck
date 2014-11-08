package pokedeck;

import java.util.ArrayList;
import java.util.HashMap;

public class Pokemon extends Card implements java.io.Serializable{
	private transient EnergyType energyType;
	private ArrayList<Capacity> capacitys = new ArrayList<Capacity>();
	private int hp;
	private Pokemon evolOf;
	private int stage;

	/**
	 * Default Pokemon
	 */
	public Pokemon() {
	}
	
	/**
	 * Create a Pokemon with just a name
	 * 
	 * @param name
	 */
	public Pokemon(String name) {
		super.name = name;
		
	}
	
	/**
	 * Create a pokemon with just a number of the card ( number in extension set ) 
	 * 
	 * @param number
	 */
	public Pokemon(int number) {
		super.number = number;
	}

	/**
	 * For Pokemon who is not a evolution from another one
	 * 
	 * @param energyType
	 * @param capacity
	 * @param hp
	 * @param stage
	 * @param description
	 */
	public Pokemon(String name, int number, EnergyType energyType,
			ArrayList<Capacity> capacity, int hp, int stage, String description) {
		this.energyType = energyType;
		this.capacitys = capacity;
		this.hp = hp;
		this.stage = stage;
		super.description = description;
		super.number = number;
		super.name = name;
	}

	/**
	 * For Pokemon who who is the evolution of another pokemon
	 * 
	 * @param energyType
	 * @param capacity
	 * @param hp
	 * @param stage
	 * @param description
	 * @param evolof
	 */
	public Pokemon(String name, int number, EnergyType energyType,
			ArrayList<Capacity> capacity, int hp, int stage,
			String description, Pokemon evolof) {
		super.name = name;
		this.energyType = energyType;
		this.capacitys = capacity;
		this.hp = hp;
		this.stage = stage;
		this.evolOf = evolof;
		super.description = description;
		super.number = number;
	}

	public EnergyType getEnergyType() {
		return this.energyType;
	}

	public ArrayList<Capacity> getCapacitys() {
		return this.capacitys;
	}

	public int getHp() {
		return this.hp;
	}

	public Pokemon getEvolOf() {
		return this.evolOf;
	}

	public int getStage() {
		return this.stage;
	}

	public void addEnergyType(EnergyType energyType) {
		this.energyType = energyType;
	}

	public void addCapacitys(Capacity capacitys) {
		this.capacitys.add(capacitys);
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}

	public void setEvolOf(Pokemon pokemon) {
		this.evolOf = pokemon;
	}
	public HashMap display(){
		HashMap pokemon = this.toMap();
		
		return pokemon ;
	}
	private HashMap<String, String> toMap(){
		HashMap <String, String> map = new HashMap<String, String>();
		map.put("name", super.name);
		map.put("number", String.valueOf(super.number));
		map.put("description", super.description);
		map.put("hp", String.valueOf(this.hp));
		map.put("stage", String.valueOf(this.stage));
		
		return map;
	}
}
