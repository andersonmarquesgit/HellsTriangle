package com.hells.model;

public class Triangle {

	private int[][] elements;

	public Triangle(final int[][] input) {
		this.elements = input;
	}

	public int getLength() {
		return this.elements.length;
	}

	public int getTop() {
		return this.elements[0][0];
	}

	public int getMajorElementOfTheNearBy(int i, int col) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getColMajorElementOfTheNearBy(int i, int col) {
		// TODO Auto-generated method stub
		return 0;
	}

	protected int getLeftNeighbor(int line, int col) {
		return this.elements[line + 1][col];
	}

	protected int getRightNeighbor(int line, int col) {
		return this.elements[line + 1][col + 1];
	}
}
