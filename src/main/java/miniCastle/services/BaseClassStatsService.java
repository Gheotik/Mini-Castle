package miniCastle.services;

import miniCastle.repository.BaseClassStatsRepository;
import miniCastle.dto.BaseClassStatsDto;
import miniCastle.dao.BaseClassStats;

public class BaseClassStatsService {
	
	private BaseClassStatsRepository repository = new BaseClassStatsRepository();

	public void createBaseClassStats(BaseClassStatsDto baseClassStatsDto) {
		// TODO Auto-generated method stub
		
		BaseClassStats baseClassStats = new BaseClassStats(15, 10, baseClassStatsDto.getName(), 20, 25, null);
		
		repository.insert(baseClassStats);
	}

}
