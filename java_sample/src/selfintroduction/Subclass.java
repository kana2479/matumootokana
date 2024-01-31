package selfintroduction;

public class Subclass extends Superclass {
	public int hp;
	public int mp;
	public int offensivePower;
	public int agility;
	public int defensePower;

	public Subclass(String name, int hp, int mp, int offensivePower, int agility, int defensePower) {
		super(name);
		this.hp = hp;
		this.mp = mp;
		this.offensivePower = offensivePower;
		this.agility = agility;
		this.defensePower = defensePower;

	}

	/*------HPのgetter/setter-------*/
	public int gethp() {
		return hp;
	}

	public void sethp(int hp) {
		this.hp = hp;
	}

	/*------MPのgetter/setter-------*/
	public int getmp() {
		return mp;
	}

	public void setmp(int mp) {
		this.mp = mp;
	}

	/*-----offensivePowerのgetter/setter-------*/
	public int getOffensivePower() {
		return offensivePower;
	}

	public void setOffensivePower(int offensivePower) {
		this.offensivePower = offensivePower;
	}

	/*-----agilityのgetter/setter-------*/
	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	/*-----defensePowerのgetter/setter-------*/
	public int getDefensePower() {
		return defensePower;
	}

	public void setDefensePower(int defensePower) {
		this.defensePower = defensePower;
	}

}