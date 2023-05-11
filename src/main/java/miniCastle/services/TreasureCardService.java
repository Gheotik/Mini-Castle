package miniCastle.services;

import miniCastle.dao.TreasureCard;
import miniCastle.dto.TreasureCardDto;
import miniCastle.repository.TreasureCardRepository;

public class TreasureCardService {
	private TreasureCardRepository repository = new TreasureCardRepository();
	
	public TreasureCard readTreasureCard(TreasureCardDto treasureCardDto) {
		return repository.findById(treasureCardDto.getTreasureId());
	}
	
	public void update(TreasureCardDto treasureCardDto)
	{
		TreasureCard treasureCard = new TreasureCard(
				treasureCardDto.getTreasureId(),
				treasureCardDto.getDescription(),
				treasureCardDto.getScoreValue(),
				treasureCardDto.getCardImagePath(),
				treasureCardDto.getLoot()
		);
		this.repository.update(treasureCard);
	}
	
	public void insert(TreasureCardDto treasureCardDto)
	{
		TreasureCard treasureCard = new TreasureCard(
				treasureCardDto.getTreasureId(),
				treasureCardDto.getDescription(),
				treasureCardDto.getScoreValue(),
				treasureCardDto.getCardImagePath(),
				treasureCardDto.getLoot()
		);
		this.repository.insert(treasureCard);
	}
	
	public void delete(TreasureCardDto treasureCardDto)
	{
		this.repository.delete(treasureCardDto.getTreasureId());
	}
}
