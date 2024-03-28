package animals;

public class Zebra extends Animals{
	
public String zebra;
	
	public Zebra(String animalName, double bodyWeight, int speed, String zebra) {
		super(animalName,bodyWeight,speed);
		this.zebra =zebra;
		
	}

	public String getZebra() {
		return zebra;
	}

	public void setZebra(String zebra) {
		this.zebra = zebra;
	}
	
}
