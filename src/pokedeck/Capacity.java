package pokedeck;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Capacity implements java.io.Serializable {

	private String name;
	private HashMap<EnergyType, Integer> cost = new HashMap<EnergyType, Integer>();
	private int damage;
	private String description;

	public Capacity() {

	}

	public Capacity(String name, HashMap<EnergyType, Integer> cost, int damage,
			String description) {
		this.name = name;
		this.cost = cost;
		this.damage = damage;
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public String getName() {
		return this.name;
	}

	public String getCost() {
		String costToString = null;
		Set<Map.Entry<EnergyType, Integer>> set = this.cost.entrySet();
		for (Map.Entry<EnergyType, Integer> me : set) {
			if (me.getValue() != null)
				costToString += me.getValue() + " " + me.getKey() + " ";
		}

		return costToString;
	}

	public int getDamage() {
		return this.damage;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

	// public void setCost(ArrayList<EnergyType> cost) {
	// this.cost = cost;
	// }

	public void setDamage(int damage) {
		this.damage = damage;
	}
}
