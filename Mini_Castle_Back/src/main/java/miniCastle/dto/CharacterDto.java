package miniCastle.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "character_Dto")

public class CharacterDto {
	@Id
	@Column(name = "character_id")
	private Integer characterId;

	@Column(name = "level")
	private Integer level;

	@Column(name = "xp")
	private Integer xp;

	@ManyToOne
	@JoinColumn(name = "player_id")
	private PlayerDto player;

	@ManyToOne
	@JoinColumn(name = "class_id")
	private BaseClassStatsDto classStats;

	@Column(name = "inventory_id")
	private Integer inventoryId;

	public CharacterDto() {

	}

	public CharacterDto(Integer characterId, Integer level, Integer xp, PlayerDto player, BaseClassStatsDto classStats,
			Integer inventoryId) {
		this.characterId = characterId;
		this.level = level;
		this.xp = xp;
		this.player = player;
		this.classStats = classStats;
		this.inventoryId = inventoryId;
	}

	public Integer getCharacterId() {
		return characterId;
	}

	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getXp() {
		return xp;
	}

	public void setXp(Integer xp) {
		this.xp = xp;
	}

	public PlayerDto getPlayer() {
		return player;
	}

	public void setPlayer(PlayerDto player) {
		this.player = player;
	}

	public BaseClassStatsDto getClassStats() {
		return classStats;
	}

	public void setClassStats(BaseClassStatsDto classStats) {
		this.classStats = classStats;
	}

	public Integer getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}
}
