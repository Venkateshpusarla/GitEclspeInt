package com.unilever.mock;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Position {

	private List<Player> player;

	private String value;

	public Position() {
	}

	public Position(String value, List<Player> p) {
		super();
		this.value = value;
		this.player = p;
	}

	@XmlElement
	public List<Player> getPlayer() {
		return player;
	}

	public void setPlayer(List<Player> Player) {
		this.player = Player;
	}

	@XmlAttribute
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ClassPojo [Player = " + player + ", value = " + value + "]";
	}
}