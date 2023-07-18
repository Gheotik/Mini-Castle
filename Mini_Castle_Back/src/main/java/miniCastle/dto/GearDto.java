package miniCastle.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "gear_Dto")

public class GearDto {

	@Id
	@Column(name = "character_id")
	private Integer characterId;

	@Column(name = "gear_slot_id")
	private String gearSlotId;

	@Column(name = "damage")
	private Integer damage;

	@Column(name = "armor")
	private Integer armor;

	@Column(name = "price")
	private Integer price;

	@ManyToOne
	@JoinColumn(name = "character_id", insertable = false, updatable = false)
	private CharacterDto character;

	public GearDto() {

	}

	public GearDto(Integer characterId, String gearSlotId, Integer damage, Integer armor, Integer price,
			CharacterDto character) {
		this.characterId = characterId;
		this.gearSlotId = gearSlotId;
		this.damage = damage;
		this.armor = armor;
		this.price = price;
		this.character = character;
	}

	// Getters and setters

	public Integer getCharacterId() {
		return characterId;
	}

	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}

	public String getGearSlotId() {
		return gearSlotId;
	}

	public void setGearSlotId(String gearSlotId) {
		this.gearSlotId = gearSlotId;
	}

	public Integer getDamage() {
		return damage;
	}

	public void setDamage(Integer damage) {
		this.damage = damage;
	}

	public Integer getArmor() {
		return armor;
	}

	public void setArmor(Integer armor) {
		this.armor = armor;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public CharacterDto getCharacter() {
		return character;
	}

	public void setCharacter(CharacterDto character) {
		this.character = character;
	}
}