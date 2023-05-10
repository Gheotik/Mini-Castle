package miniCastle.controllers;

import miniCastle.dto.MonsterCardDto;
import miniCastle.services.MonsterCardService;

public class MonsterCardController {
	private MonsterCardService service = new MonsterCardService();
	
	public void readMonsterCard(MonsterCardDto monsterCardDto) {
		service.readMonsterCard(monsterCardDto);
	}
	
	public void run() {
		// TODO Auto-generated method stub
	}
}
