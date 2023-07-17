package miniCastle.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "treasure_card_Dto")

public class TreasureCardDto {
	@Column(name = "card_id")
	private int cardId;

	@Column(name = "loot_id")
	private int lootId;

	@Column(name = "treasure_id")
	private int treasureId;

	public TreasureCardDto() {
    }

	public TreasureCardDto(int cardId, int lootId, int treasureId) {
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

	
}