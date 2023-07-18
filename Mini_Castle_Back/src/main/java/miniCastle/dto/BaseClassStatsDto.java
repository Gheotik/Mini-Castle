package miniCastle.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "base_class_stats_Dto")

public class BaseClassStatsDto {
	@Id
	@Column(name = "class_id")
	private Integer classId;

	@Column(name = "name")
	private String name;

	@Column(name = "base_hp")
	private Integer baseHp;

	@Column(name = "base_armor")
	private Integer baseArmor;

	@Column(name = "base_damage")
	private Integer baseDamage;

	@Column(name = "skill_name")
	private String skillName;

	@Column(name = "skill_description")
	private String skillDescription;

	@Column(name = "image_path")
	private String imagePath;

	private PlayerDto player;

	public BaseClassStatsDto() {

	}

	public BaseClassStatsDto(Integer classId, String name, Integer baseHp, Integer baseArmor, Integer baseDamage,
			String skillName, String skillDescription, String imagePath) {
		this.classId = classId;
		this.name = name;
		this.baseHp = baseHp;
		this.baseArmor = baseArmor;
		this.baseDamage = baseDamage;
		this.skillName = skillName;
		this.skillDescription = skillDescription;
		this.imagePath = imagePath;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBaseHp() {
		return baseHp;
	}

	public void setBaseHp(Integer baseHp) {
		this.baseHp = baseHp;
	}

	public Integer getBaseArmor() {
		return baseArmor;
	}

	public void setBaseArmor(Integer baseArmor) {
		this.baseArmor = baseArmor;
	}

	public Integer getBaseDamage() {
		return baseDamage;
	}

	public void setBaseDamage(Integer baseDamage) {
		this.baseDamage = baseDamage;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getSkillDescription() {
		return skillDescription;
	}

	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
