package pokedeck;

import java.util.HashMap;

public class Trainer extends Card{
	private String type;
	private String rule;
	
	/**
	 * When we don't know the card stat
	 */
	public Trainer(){
		
	}
	/**
	 * When we know the card stat
	 * 
	 * @param type
	 * @param description
	 * @param rule
	 */
	public Trainer(String type, String description, String rule){
		this.rule = rule;
		this.type = type;
		super.description = description;
	}
	
	public String getRule(){
		return this.rule;
	}
	public String getType(){
		return this.type;
	}
	public void setRule(String rule){
		 this.rule = rule;
	}
	public void setType(String type){
		 this.type = type;
	}
	public HashMap display(){
		HashMap<String, String> dumb = new HashMap();
		return dumb;
	}
}
