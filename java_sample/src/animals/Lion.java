package animals;

public class Lion extends Animals {
	
	public String lion;
	
	public Lion(String animalName, double bodyWeight, int speed, String lion) {
		super(animalName,bodyWeight,speed);
		this.lion =lion;
		
		
	}

	public String getLion() {
		return lion;
	}

	public void setLion(String lion) {
		this.lion = lion;
	}

}
