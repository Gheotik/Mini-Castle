package miniCastle.dao;

public class TreasureCard implements ICard {
	private int treasureId;
	private String description;
	private int scoreValue;
	private String cardImagePath;
	private Loot loot;
	
	
	public TreasureCard(int treasureId, String description, int scoreValue, String cardImagePath, Loot loot) {
		super();
		this.treasureId = treasureId;
		this.description = description;
		this.scoreValue = scoreValue;
		this.cardImagePath = cardImagePath;
		this.loot = loot;
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
	
	public Loot getLoot() {
		return this.loot;
	}

	public void setLoot(Loot loot) {
		this.loot = loot;
	}

	public int getTreasureId() {
		return treasureId;
	}


	public void run() {
		// TODO Auto-generated method stub
		
	}
}
