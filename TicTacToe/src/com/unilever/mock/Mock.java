package com.unilever.mock;

import java.util.List;

public class Mock {
	private List<Position> position;

	public Mock() {
	}

	public Mock(List<Position> p) {
		super();
		this.position = p;
	}

	public List<Position> getPosition() {
		return position;
	}

	public void setPosition(List<Position> Position) {
		this.position = Position;
	}

	@Override
	public String toString() {
		return "ClassPojo [Position = " + position + "]";
	}
}