package miniCastle.dto;

public class TrapCardDto {
	private int trapId;
	private String description;
	private int scoreValue;
	private String cardImagePath;
	private int skillCheck;

		
	public TrapCardDto(int trapId, String description, int scoreValue, String cardImagePath, int skillCheck) {
		this.description = description;
		this.scoreValue = scoreValue;
		this.cardImagePath = cardImagePath;
		this.trapId = trapId;
		this.skillCheck = skillCheck;
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
	
	public int getSkillCheck() {
		return skillCheck;
	}

	public void setSkillCheck(int skillCheck) {
		this.skillCheck = skillCheck;
	}

	public int getTrapId() {
		return trapId;
	}
	
}
