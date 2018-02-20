package com.hells;

import java.util.Scanner;

import com.hells.calc.TriangleCalc;
import com.hells.model.Triangle;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String inputArray = in.nextLine();
		
		if(!inputArray.isEmpty()) {
			Integer[][] t = TriangleCalc.getElements(inputArray);
			
			Triangle triangle = new Triangle(t);
			System.out.println(TriangleCalc.getMaximumTotal(triangle));
		}else {
			System.out.println(0);
		}
			
		
		
		
	}


}
