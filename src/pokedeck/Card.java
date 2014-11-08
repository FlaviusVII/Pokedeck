package pokedeck;

import java.util.HashMap;

abstract public class Card implements java.io.Serializable{
	protected String name;
	protected Extension extension;
	protected int number;
	protected String description;

	public Card() {

	}

	public Card(String name, Extension extension, int number) {
		this.name = name;
		this.extension = extension;
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	public Extension getExtension() {
		return this.extension;
	}

	public int getNumber() {
		return this.number;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setExtension(Extension extension) {
		this.extension = extension;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	abstract public HashMap display();
}
