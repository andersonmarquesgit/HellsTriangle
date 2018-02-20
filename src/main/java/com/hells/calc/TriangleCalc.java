package com.hells.calc;

import com.hells.model.Triangle;

public abstract class TriangleCalc {

	public int getMaximumTotal(Triangle triangle) {
		int maxTotal = triangle.getTop();
		int col = 0;
		
		for(int i = 0; i < triangle.getLength() - 1; i++) {
			maxTotal += triangle.getMajorElementOfTheNearBy(i, col);
		    
		    col = triangle.getColMajorElementOfTheNearBy(i, col);
		}
		
		return maxTotal;
	}
}
