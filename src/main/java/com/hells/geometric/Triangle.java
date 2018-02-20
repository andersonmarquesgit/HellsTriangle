package com.hells.geometric;

public class Triangle {

	private Integer[][] elements;

	public Triangle(Integer[][] input) {
		this.elements = input;
	}

	public int getLength() {
		return this.elements.length;
	}

	public int getTop() {
		return this.elements[0][0];
	}

	public int getMajorElementOfTheNearBy(int line, int col) {
		return Math.max(getLeftNeighbor(line, col), getRightNeighbor(line, col));
	}

	public int getColMajorElementOfTheNearBy(int line, int col) {
		if(getLeftNeighbor(line, col) > getRightNeighbor(line, col)) {
		    return col;
		} else {
		    return col+1;
		}
	}

	protected int getLeftNeighbor(int line, int col) {
		return this.elements[line + 1][col];
	}

	protected int getRightNeighbor(int line, int col) {
		return this.elements[line + 1][col + 1];
	}
}
