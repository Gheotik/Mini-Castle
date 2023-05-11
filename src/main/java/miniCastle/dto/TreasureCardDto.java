package miniCastle.dto;

import miniCastle.dao.Loot;

public class TreasureCardDto {
	private int treasureId;
	private String description;
	private int scoreValue;
	private String cardImagePath;
	private Loot loot;
	
	
	public TreasureCardDto(int treasureId, String description, int scoreValue, String cardImagePath, Loot loot) {
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
}
