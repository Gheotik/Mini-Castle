package miniCastle.services;

import miniCastle.dto.MonsterCardDto;
import miniCastle.repository.MonsterCardRepository;
import miniCastle.dao.MonsterCard;

public class MonsterCardService {
	
	private MonsterCardRepository repository = new MonsterCardRepository();
	
	public MonsterCard readMonsterCard(MonsterCardDto monsterCardDto) {
		return repository.findById(monsterCardDto.getMonsterId());
	}
	
	public void update(MonsterCardDto monsterCardDto)
	{
		MonsterCard monsterCard = new MonsterCard(
				monsterCardDto.getMonsterId(),
				monsterCardDto.getDescription(),
				monsterCardDto.getScoreValue(),
				monsterCardDto.getCardImagePath(),
				monsterCardDto.getDamage(),
				monsterCardDto.getHp(),
				monsterCardDto.getXpReward()
		);
		this.repository.update(monsterCard);
	}
	
	public void insert(MonsterCardDto monsterCardDto)
	{
		MonsterCard monsterCard = new MonsterCard(
				monsterCardDto.getMonsterId(),
				monsterCardDto.getDescription(),
				monsterCardDto.getScoreValue(),
				monsterCardDto.getCardImagePath(),
				monsterCardDto.getDamage(),
				monsterCardDto.getHp(),
				monsterCardDto.getXpReward()
		);
		this.repository.insert(monsterCard);	
	}
	
	public void delete(MonsterCardDto monsterCardDto)
	{
		this.repository.delete(monsterCardDto.getMonsterId());
	}
}
