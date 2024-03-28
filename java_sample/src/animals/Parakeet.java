package animals;

public class Parakeet  extends Animals{
	
public String parakeet;
	
	public Parakeet(String animalName, double bodyWeight, int speed, String parakeet) {
		super(animalName,bodyWeight,speed);
		this.parakeet =parakeet;
		
		
	}

	public String getParakeet() {
		return parakeet;
	}

	public void setParakeet(String parakeet) {
		this.parakeet = parakeet;
	}

	
}
