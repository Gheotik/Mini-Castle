package miniCastle.dto;

public class CharacterDto {
	
	private String name;
	
	private int armor;
	
	private int hp;
	
	private int damage;
	
	private int level;
	
	private int xp;

	
	public CharacterDto(String name, int armor, int hp, int damage, int level, int xp) {
		super();
		this.name = name;
		this.armor = armor;
		this.hp = hp;
		this.damage = damage;
		this.level = level;
		this.xp = xp;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}
	
}
