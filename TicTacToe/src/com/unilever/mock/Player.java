package com.unilever.mock;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Player {
	private String xcod;

	private String value;

	private String ycod;

	public Player() {
	}

	public Player(String value, String x, String y) {
		this.value = value;
		this.xcod = x;
		this.ycod = y;
	}

	@XmlElement
	public String getXcod() {
		return xcod;
	}

	public void setXcod(String xcod) {
		this.xcod = xcod;
	}

	@XmlAttribute
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@XmlElement
	public String getYcod() {
		return ycod;
	}

	public void setYcod(String ycod) {
		this.ycod = ycod;
	}

	@Override
	public String toString() {
		return "ClassPojo [xcod = " + xcod + ", value = " + value + ", ycod = " + ycod + "]";
	}
}