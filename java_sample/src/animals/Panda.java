package animals;

public class Panda extends Animals{

public String panda;
	
	public Panda(String animalName, double bodyWeight, int speed, String panda) {
		super(animalName,bodyWeight,speed);
		this.panda =panda;
		
		
	}

	public String getPanda() {
		return panda;
	}

	public void setPanda(String panda) {
		this.panda = panda;
	}
}
