package miniCastle.dao;

public class MonsterCard implements ICard {

	private int cardId;
	private int monsterId;
	private int damage;
	private int hp;
	private int xpReward;

	public MonsterCard(int cardId, int monsterId, int damage, int hp, int xpReward) {
		this.cardId = cardId;
		this.monsterId = monsterId;
		this.damage = damage;
		this.hp = hp;
		this.xpReward = xpReward;
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

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public void setMonsterId(int monsterId) {
		this.monsterId = monsterId;
	}

	public void setXpReward(int xpReward) {
		this.xpReward = xpReward;
	}

	@Override
	public String toString() {
		return "MonsterCard [cardId=" + cardId + ", monsterId=" + monsterId + ",  damage=" + damage + ", hp=" + hp
				+ ", xpReward=" + xpReward + "]";
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
