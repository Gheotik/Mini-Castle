package miniCastle.controllers;

import miniCastle.dto.BaseClassStatsDto;
import miniCastle.dto.BaseClassStatsDto;
import miniCastle.services.BaseClassStatsService;

public class BaseClassStatsController {
	
	private BaseClassStatsService service = new BaseClassStatsService();
	
	public void createBaseClassStats (BaseClassStatsDto baseClassStatsDto) {
		
		service.createBaseClassStats(baseClassStatsDto);
	}
}
