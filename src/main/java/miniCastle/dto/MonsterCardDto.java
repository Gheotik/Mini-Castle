package miniCastle.dto;

public class MonsterCardDto {
	private String description;
	private int scoreValue;
	private String cardImagePath;
	private int monsterId;
	private int damage;
	private int hp;
	private int xpReward;
	
	public MonsterCardDto(int monsterId, String description, int scoreValue, String cardImagePath, int damage, int hp, int xpReward) {
		this.description = description;
		this.scoreValue = scoreValue;
		this.cardImagePath = cardImagePath;
		this.monsterId = monsterId;
		this.damage = damage;
		this.hp = hp;
		this.xpReward = xpReward;
	}
	
	public String getDescription() {
		return this.description;
	}

	public int getScoreValue() {
		return this.scoreValue;
	}

	public void setScoreValue(int score) {
		this.scoreValue = score;
	}

	public String getCardImagePath() {
		return this.cardImagePath;
	}
	
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMonsterId() {
		return monsterId;
	}

	public int getXpReward() {
		return xpReward;
	}
}
