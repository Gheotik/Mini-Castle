package miniCastle.dto;

import jakarta.persistence.*;

import miniCastle.dao.Gear;

@Entity
@Table(name = "inventory_Dto")

public class InventoryDto {

	@Id
	@Column(name = "character_id")
	private Integer characterId;

	@Column(name = "coin")
	private Integer coin;

	@Column(name = "potion")
	private Integer potion;

	@OneToOne
	@PrimaryKeyJoinColumn
	private CharacterDto character;

	public InventoryDto() {

	}

	public InventoryDto(Integer characterId, Integer coin, Integer potion, CharacterDto character) {
		this.characterId = characterId;
		this.coin = coin;
		this.potion = potion;
		this.character = character;
	}

	// Getters and setters

	public Integer getCharacterId() {
		return characterId;
	}

	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}

	public Integer getCoin() {
		return coin;
	}

	public void setCoin(Integer coin) {
		this.coin = coin;
	}

	public Integer getPotion() {
		return potion;
	}

	public void setPotion(Integer potion) {
		this.potion = potion;
	}

	public CharacterDto getCharacter() {
		return character;
	}

	public void setCharacter(CharacterDto character) {
		this.character = character;
	}
}