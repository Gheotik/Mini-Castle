package miniCastle.dao;

public class TrapCard implements ICard {
	private int cardId;
	private int skillCheck;
	private int damage;

	public TrapCard(int cardId, int skillCheck, int damage) {
		this.cardId = cardId;
		this.skillCheck = skillCheck;
		this.damage = damage;

	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public int getSkillCheck() {
		return skillCheck;
	}

	public void setSkillCheck(int skillCheck) {
		this.skillCheck = skillCheck;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	@Override
	public String toString() {
		return "TrapCard [cardId=" + cardId + ", skillCheck=" + skillCheck + ", damage=" + damage + "]";
	}

	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getScoreValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setScoreValue(int score) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCardImagePath() {
		// TODO Auto-generated method stub
		return null;
	}
}
