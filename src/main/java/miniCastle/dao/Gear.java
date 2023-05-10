package miniCastle.dao;

public class Gear {
	
	private int gearSlotId;
	
	private int damage;
	
	private int armor;
	
	
	public Gear() {
		super();
	}


	public Gear(int gearSlotId, int damage, int armor) {
		super();
		this.gearSlotId = gearSlotId;
		this.damage = damage;
		this.armor = armor;
	}
	

	public int getGearSlotId() {
		return gearSlotId;
	}

	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	public int getArmor() {
		return armor;
	}


	public void setArmor(int armor) {
		this.armor = armor;
	}
	
}
