package com.hells;

import java.util.Scanner;

import com.hells.calc.TriangleCalc;
<<<<<<< HEAD
import com.hells.geometric.Triangle;
=======
import com.hells.model.Triangle;
>>>>>>> 1bce4b18e81d746c6aef94eb0fa3efffe3afda78

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
<<<<<<< HEAD
	}
=======
			
		
		
		
	}


>>>>>>> 1bce4b18e81d746c6aef94eb0fa3efffe3afda78
}
