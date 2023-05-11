package miniCastle.services;

import miniCastle.repository.CharacterRepository;
import miniCastle.dto.CharacterDto;

public class CharacterService {
	
	private CharacterRepository repository = new CharacterRepository();

	public void readCharacter(CharacterDto characterDto) {
		// TODO Auto-generated method stub
		
		repository.findById(characterDto.getId());
	}

}
