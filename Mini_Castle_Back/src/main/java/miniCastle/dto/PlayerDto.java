package miniCastle.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "player_Dto")

public class PlayerDto {
	@Id
	@Column(name = "player_id")
	private Integer playerId;

	@Column(name = "mail")
	private String mail;

	@Column(name = "nickname")
	private String nickname;

	@Column(name = "passwd")
	private String passwd;

	@Column(name = "best_score")
	private Integer bestScore;

	public PlayerDto() {

	}

	public PlayerDto(Integer playerId, String mail, String nickname, String passwd, Integer bestScore) {
		this.playerId = playerId;
		this.mail = mail;
		this.nickname = nickname;
		this.passwd = passwd;
		this.bestScore = bestScore;
	}

	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Integer getBestScore() {
		return bestScore;
	}

	public void setBestScore(Integer bestScore) {
		this.bestScore = bestScore;
	}
}