package miniCastle.dao;

public class Character {
	
	private int id;
	
	private String name;
	
	private int armor;
	
	private int hp;
	
	private int damage;
	
	private int level;
	
	private int xp;
	
	private BaseClassStats baseClassStats;
	
	private Inventory inventory;

	private String charImagePath;
	
	
	public Character() {
		super();
	}

	
	public Character(int id, String charImagePath, String name, int armor, int hp, int damage, int level, int xp,
			BaseClassStats baseClassStats, Inventory inventory) {
		super();
		this.id = id;
		this.charImagePath = charImagePath;
		this.name = name;
		this.armor = armor;
		this.hp = hp;
		this.damage = damage;
		this.level = level;
		this.xp = xp;
		this.baseClassStats = baseClassStats;
		this.inventory = inventory;
	}

	
	public String getCharImagePath() {
		return charImagePath;
	}
	
	public void setCharImagePath(String charImagePath) {
		this.charImagePath = charImagePath;
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
	
	public BaseClassStats getBaseClassStats() {
		return baseClassStats;
	}
	
	public void setBaseClassStats(BaseClassStats baseClassStats) {
		this.baseClassStats = baseClassStats;
	}
	
	public Inventory getInventory() {
		return inventory;
	}
	
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	public int getId() {
		return id;
	}

}
