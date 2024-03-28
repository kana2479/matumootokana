package animals;

public class Animals {
	//動物名
	public String animalName;
	//身長
	public double bodyWeight;
	//速度
	public int speed;


    public Animals (String animalName,double bodyWeight,int speed) {
    	this.animalName = animalName;
    	this.bodyWeight=bodyWeight;
    	this.speed =speed;
    	
    }


	public String getAnimalName() {
		return animalName;
	}


	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}


	public double getBodyWeight() {
		return bodyWeight;
	}


	public void setBodyWeight(double bodyWeight) {
		this.bodyWeight = bodyWeight;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
		
	
}
