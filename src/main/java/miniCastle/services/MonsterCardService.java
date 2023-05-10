package miniCastle.services;

import miniCastle.dto.MonsterCardDto;
import miniCastle.repository.MonsterCardRepository;
import miniCastle.dao.MonsterCard;

public class MonsterCardService {
	
	private MonsterCardRepository repository = new MonsterCardRepository();
	
	public MonsterCard readMonsterCard(MonsterCardDto monsterCardDto) {
		return repository.findById(monsterCardDto.getMonsterId());
	}
}
