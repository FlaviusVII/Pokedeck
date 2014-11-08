package pokedeck;

import java.util.HashMap;

public class Energy extends Card{
	private String type;
	
	public String getType(){
		return this.type;
	}
	
	public void setType(String type){
		 this.type = type;
	}
	public HashMap display(){
		HashMap<String, String> dumb = new HashMap();
		return dumb;
	}
}
