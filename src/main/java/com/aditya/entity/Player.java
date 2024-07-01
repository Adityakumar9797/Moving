package com.aditya.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //it is mandatory annotation to map the java class with database
@Table(name="CRICKET_PLAYER")
public class Player {
	
	
	@Id  //@ID anootation represent player id variable is mapped to primary key column in the table
    @Column(name="PLAYER_ID")
	private Integer playerId;
	

	@Column(name="PLAYER_NAME")
	private String playerName;
    
    @Column(name="PLAYER_AGE")
	private Integer playerAge;
    
	private String location;

	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Integer getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(Integer playerAge) {
		this.playerAge = playerAge;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	} 

	

    @Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerAge=" + playerAge
				+ ", location=" + location + "]";
	}
}
