package miniCastle.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "loot_table_Dto")

public class LootTableDto {

	@Column(name = "loot_id")
	private int lootId;

	@Column(name = "gearSlot_id")
	private int gearSlotId;

	@Column(name = "damage")
	private int damage;

	@Column(name = "armor")
	private int armor;

	@Column(name = "name")
	private String name;

	public LootTableDto() {
	}

	public LootTableDto(int lootId, int gearSlotId, int damage, int armor, String name) {
		super();
		this.lootId = lootId;
		this.gearSlotId = gearSlotId;
		this.damage = damage;
		this.armor = armor;
		this.name = name;
	}

	public int getLootId() {
		return lootId;
	}

	public void setLootId(int lootId) {
		this.lootId = lootId;
	}

	public int getGearSlotId() {
		return gearSlotId;
	}

	public void setGearSlotId(int gearSlotId) {
		this.gearSlotId = gearSlotId;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
