package miniCastle.dao;

public class BaseClassStats {
	
	private int baseHp;
	
	private int baseDamage;
	
	private String name;
	
	private String skill;
	
	private int baseArmor;
	
	private String charImagePath;
	

	public BaseClassStats() {
		super();
	}

	
	public BaseClassStats(int baseHp, int baseDamage, String name, String skill, int baseArmor, String charImagePath) {
		super();
		this.baseHp = baseHp;
		this.baseDamage = baseDamage;
		this.name = name;
		this.skill = skill;
		this.baseArmor = baseArmor;
		this.charImagePath = charImagePath;
	}


	public String getCharImagePath() {
		return charImagePath;
	}


	public void setCharImagePath(String charImagePath) {
		this.charImagePath = charImagePath;
	}


	public int getBaseHp() {
		return baseHp;
	}


	public void setBaseHp(int baseHp) {
		this.baseHp = baseHp;
	}


	public int getBaseDamage() {
		return baseDamage;
	}


	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	
	public String getSkill() {
		return skill;
	}


	public void setSkill(String skill) {
		this.skill = skill;
	}


	public int getBaseArmor() {
		return baseArmor;
	}


	public void setBaseArmor(int baseArmor) {
		this.baseArmor = baseArmor;
	}
	
	
}
