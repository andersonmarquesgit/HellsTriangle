package com.hells.calc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

<<<<<<< HEAD
import com.hells.geometric.Triangle;
=======
import com.hells.model.Triangle;
>>>>>>> 1bce4b18e81d746c6aef94eb0fa3efffe3afda78

public abstract class TriangleCalc {

	public static int getMaximumTotal(Triangle triangle) {
		int maxTotal = triangle.getTop();
		int col = 0;
		
		for(int i = 0; i < triangle.getLength() - 1; i++) {
			maxTotal += triangle.getMajorElementOfTheNearBy(i, col);
		    
		    col = triangle.getColMajorElementOfTheNearBy(i, col);
		}
		
		return maxTotal;
	}
	
	public static Integer[][] getElements(String inputArray) {
		String triangleRows = parseInput(inputArray);
		return parseTriangleRows(triangleRows);
	}
	
	protected static String parseInput(String array) {
		String regex = "(\\[|\\{)(.+)(\\]|\\})";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(array);
		if (matcher.find()) {
			return matcher.group(2);
		}
		return "";
	}

	protected static Integer[][] parseTriangleRows(String rows) {
		List<Integer[]> rowsList = new ArrayList<>();
		String regex = "((\\[|\\{)(((\\d+),?)+)(\\]|\\}))";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(rows);
		while (matcher.find()) {
			String group = matcher.group(3);
			Integer[] row = Arrays.stream(Stream.of(group.split(",")).mapToInt(Integer::parseInt).toArray()).boxed()
					.toArray(Integer[]::new);
			rowsList.add(row);
		}
		Integer[][] triangleArray = new Integer[rowsList.size()][];
		for (int i = 0; i < triangleArray.length; i++) {
			triangleArray[i] = rowsList.get(i);
		}
		return triangleArray;
	}
}
