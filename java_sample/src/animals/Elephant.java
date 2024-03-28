package animals;

public class Elephant extends Animals{
	
public String elephant;
	
	public Elephant(String animalName, double bodyWeight, int speed, String elephant) {
		super(animalName,bodyWeight,speed);
		this.elephant =elephant;
		
		
	}

	public String getElephant() {
		return elephant;
	}

	public void setElephant(String elephant) {
		this.elephant = elephant;
	}

}
