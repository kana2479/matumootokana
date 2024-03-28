package animals;

public class Chimpanze extends Animals {
	
public String chimpanze;
	
	public Chimpanze(String animalName, double bodyWeight, int speed, String chimpanze) {
		super(animalName,bodyWeight,speed);
		this.chimpanze =chimpanze;
		
		
	}

	public String getChimpanze() {
		return chimpanze;
	}

	public void setChimpanze(String chimpanze) {
		this.chimpanze = chimpanze;
	}


}
