package miniCastle.dao;

import java.util.ArrayList;

public class Inventory {
	
	private int coins;
	
	private int potion; 
	
	private ArrayList<Gear> gears;

	
	public Inventory() {
		super();
	}

	
	public Inventory(int coins, int potion, ArrayList<Gear> gears) {
		super();
		this.coins = coins;
		this.potion = potion;
		this.gears = gears;
	}

	
	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	public int getPotion() {
		return potion;
	}

	public void setPotion(int potion) {
		this.potion = potion;
	}

	public ArrayList<Gear> getGears() {
		return gears;
	}

	public void setGears(ArrayList<Gear> gears) {
		this.gears = gears;
	}
	
	
}
