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
				trapCardDto.getTrapId(),
				trapCardDto.getDescription(),
				trapCardDto.getScoreValue(),
				trapCardDto.getCardImagePath(),
				trapCardDto.getSkillCheck()
		);
		this.repository.update(trapCard);
	}
	
	public void insert(TrapCardDto trapCardDto)
	{
		TrapCard trapCard = new TrapCard(
				trapCardDto.getTrapId(),
				trapCardDto.getDescription(),
				trapCardDto.getScoreValue(),
				trapCardDto.getCardImagePath(),
				trapCardDto.getSkillCheck()
		);
		this.repository.insert(trapCard);	
	}
	
	public void delete(TrapCardDto trapCardDto)
	{
		this.repository.delete(trapCardDto.getTrapId());
	}
}
