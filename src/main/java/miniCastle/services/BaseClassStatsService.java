package miniCastle.services;

import miniCastle.repository.BaseClassStatsRepository;
import miniCastle.dto.BaseClassStatsDto;
import miniCastle.dao.BaseClassStats;

public class BaseClassStatsService {
	
	private BaseClassStatsRepository repository = new BaseClassStatsRepository();

	public void createBaseClassStats(BaseClassStatsDto baseClassStatsDto) {
		// TODO Auto-generated method stub
		
		BaseClassStats baseClassStats = new BaseClassStats(
				baseClassStatsDto.getBaseHp(),
				baseClassStatsDto.getBaseDamage(),
				baseClassStatsDto.getName(),
				baseClassStatsDto.getSkill(),
				baseClassStatsDto.getBaseArmor(),
				baseClassStatsDto.getCharImagePath()
				);
		
		repository.insert(baseClassStats);
	}

}
