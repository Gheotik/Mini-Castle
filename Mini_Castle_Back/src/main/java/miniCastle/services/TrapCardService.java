package miniCastle.services;

import miniCastle.dao.TrapCard;
import miniCastle.dto.TrapCardDto;
import miniCastle.repository.TrapCardRepository;

public class TrapCardService {
	private TrapCardRepository repository = new TrapCardRepository();
	
	public TrapCard readTrapCard(TrapCardDto trapCardDto) {
		return repository.findById(trapCardDto.getTrapId());
	}
	
	public void update(TrapCardDto trapCardDto)
	{
		TrapCard trapCard = new TrapCard(
				trapCardDto.getCardId(),
				trapCardDto.getSkillCheck(),
				trapCardDto.getDamage()
		);
		this.repository.update(trapCard);
	}
	
	public void insert(TrapCardDto trapCardDto)
	{
		TrapCard trapCard = new TrapCard(
				trapCardDto.getCardId(),
				trapCardDto.getSkillCheck(),
				trapCardDto.getDamage()
		);
		this.repository.insert(trapCard);	
	}
	
	public void delete(TrapCardDto trapCardDto)
	{
		this.repository.delete(trapCardDto.getTrapId());
	}
}
