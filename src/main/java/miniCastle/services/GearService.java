package miniCastle.services;

import miniCastle.dao.Gear;
import miniCastle.dto.GearDto;
import miniCastle.repository.GearRepository;

public class GearService {
	
	private GearRepository repository = new GearRepository();

	public void createGear(GearDto gearDto) {
		// TODO Auto-generated method stub
		
		Gear gear = new Gear(
				gearDto.getGearSlotId(),
				gearDto.getDamage(),
				gearDto.getArmor(),
				gearDto.getPrice());
		
		repository.insert(gear);
	}

	public void readGear(GearDto gearDto) {
		// TODO Auto-generated method stub
		
		repository.findById(gearDto.getGearSlotId());
	
	}
}
