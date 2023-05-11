package miniCastle.repository;

import miniCastle.dao.MonsterCard;

public class MonsterCardRepository {

	public MonsterCard findById(int monsterId)
	{
		//TODO implement the SQL request with SpringBoot
		return new MonsterCard(monsterId, "Un monstre de ouf", 100, "https://imageDeMonstre.banger", 15, 200, 50);
	}
	
}
