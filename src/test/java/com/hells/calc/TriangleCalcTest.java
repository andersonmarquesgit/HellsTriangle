package com.hells.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.hells.geometric.Triangle;

public class TriangleCalcTest {

	@Test
	public final void getMaximumTotalTest() {
		Integer[][] array = { { 6 }, { 3, 5 }, { 9, 7, 1 }, { 4, 6, 8, 4 }, { 3, 6, 8, 4, 6 }, { 1, 2, 3, 4, 5, 6 } };

		Triangle triangle = new Triangle(array);
		assertEquals(38, TriangleCalc.getMaximumTotal(triangle));
	}

	@Test
	public final void getMajorElementOfTheNearByTest() {
		Integer[][] array = { { 6 }, { 3, 5 }, { 9, 7, 1 }, { 4, 6, 8, 4 }, { 3, 6, 8, 4, 6 }, { 1, 2, 3, 4, 5, 6 } };

		Triangle triangle = new Triangle(array);

		assertEquals(5, triangle.getMajorElementOfTheNearBy(0, 0));
	}
}
