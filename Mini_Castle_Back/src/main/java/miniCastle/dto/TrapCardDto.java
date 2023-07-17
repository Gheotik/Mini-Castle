package miniCastle.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "trap_card_Dto")

public class TrapCardDto {

	@Column(name = "card_id")
	private int cardId;

	@Column(name = "trap_id")
	private int trapId;

	@Column(name = "skill_check")
	private int skillCheck;

	public TrapCardDto() {
    }

	public TrapCardDto(int cardId, int trapId, int skillCheck) {
        this.cardId = cardId;
        this.trapId = trapId;
        this.skillCheck = skillCheck;
    }

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public int getTrapId() {
		return trapId;
	}

	public void setTrapId(int trapId) {
		this.trapId = trapId;
	}

	public int getSkillCheck() {
		return skillCheck;
	}

	public void setSkillCheck(int skillCheck) {
		this.skillCheck = skillCheck;
	}

		
}