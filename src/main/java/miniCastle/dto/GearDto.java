package miniCastle.dto;

public class GearDto {

	private int damage;
	
	private int armor;


	public GearDto(int damage, int armor) {
		super();
		this.damage = damage;
		this.armor = armor;
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
