package pokedeck;

public class Extension {
	private String name;
	private int nbTotalCard;

	public Extension() {

	}

	public Extension(String name, int nbTotalCard) {
		this.name = name;
		this.nbTotalCard = nbTotalCard;
	}

	public String getName() {
		return this.name;
	}

	public int getNbTotalCard() {
		return this.nbTotalCard;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNbTotalCard(int nbTotalCard) {
		this.nbTotalCard = nbTotalCard;
	}
}
