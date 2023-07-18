package miniCastle.dao;

public class TreasureCard implements ICard {
	private int cardId;
	private int lootId;
	private int treasureId;


	public TreasureCard(int cardId, int lootId, int treasureId) {
		super();
		this.cardId = cardId;
		this.lootId = lootId;
		this.treasureId = treasureId;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public int getLootId() {
		return lootId;
	}

	public void setLootId(int lootId) {
		this.lootId = lootId;
	}

	public int getTreasureId() {
		return treasureId;
	}

	public void setTreasureId(int treasureId) {
		this.treasureId = treasureId;
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
