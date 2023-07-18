package miniCastle.dto;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "card_Dto")

public class CardDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "card_id")
	private int cardId;

	@Column(name = "card_name")
	private String name;

	@Column(name = "card_type")
	private String cardType;

	@Column(name = "description", columnDefinition = "text")
	private String description;

	@Column(name = "score_value")
	private int scoreValue;

	@Column(name = "card_image_path")
	private String cardImagePath;
	
	@ManyToMany(mappedBy = "monsterCards")
    private List<MonsterCardDto> monsterCards;

    @ManyToMany(mappedBy = "trapCards")
    private List<TrapCardDto> trapCards;

    @ManyToMany(mappedBy = "treasureCards")
    private List<TreasureCardDto> treasureCards;

    @ManyToMany(mappedBy = "shopCards")
    private List<ShopCardDto> shopCards;

	public CardDto() {
	}

	public CardDto(int cardId, String name, String cardType, String description, int scoreValue, String cardImagePath) {
		this.cardId = cardId;
		this.name = name;
		this.cardType = cardType;
		this.description = description;
		this.scoreValue = scoreValue;
		this.cardImagePath = cardImagePath;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getScoreValue() {
		return scoreValue;
	}

	public void setScoreValue(int scoreValue) {
		this.scoreValue = scoreValue;
	}

	public String getCardImagePath() {
		return cardImagePath;
	}

	public void setCardImagePath(String cardImagePath) {
		this.cardImagePath = cardImagePath;
	}

	@Override
	public String toString() {
	    return "CardDto{" +
	            "cardId=" + cardId +
	            ", name='" + name + '\'' +
	            ", cardType='" + cardType + '\'' +
	            ", description='" + description + '\'' +
	            ", scoreValue=" + scoreValue +
	            ", cardImagePath='" + cardImagePath + '\'' +
	            '}';
	}
	
}