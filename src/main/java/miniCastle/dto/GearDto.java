package miniCastle.dto;

public class GearDto {
	
	private int gearSlotId;

	private int damage;
	
	private int armor;
	
	private int price;


	public GearDto(int gearSlotId, int damage, int armor, int price) {
		super();
		this.damage = damage;
		this.armor = armor;
		this.price = price;
	}
	
	public int getGearSlotId() {
		return gearSlotId;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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
