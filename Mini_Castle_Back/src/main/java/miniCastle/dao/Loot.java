package miniCastle.dao;

import java.util.ArrayList;

public class Loot {
	private int lootId;
	private ArrayList<Gear> gearList;
	private int coin;
	
	public Loot(int lootId, int coin) {
		this.lootId = lootId;
		this.gearList = new ArrayList<Gear>();
		this.coin = coin;
	}

	public int getLootId() {
		return lootId;
	}

	public void setLootId(int lootId) {
		this.lootId = lootId;
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public ArrayList<Gear> getLoot() {
		return gearList;
	}
	
	
	
}
