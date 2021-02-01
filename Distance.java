// Name: Jenna Adams
// Lab Partner: Brandon Lackey
// Course and lab: CPSC 1061 - Lab 3
// Date: Jan 27, 2021
// Description: Distance.java asks the user to enter the coordinates of two points and will compute 
// a formula with the user input.

// ----------------------------------------------------------------

import java.util.Scanner;

public class Distance {
	public static void main (String[] args) {


		System.out.print("Enter your first set of coordinates (separate your numbers with a space): ");
		Scanner input = new Scanner(System.in);
		double firstXData = input.nextDouble();
		double firstYData = input.nextDouble();

		System.out.print("Enter your second set of coordinates: ");
		Scanner input2 = new Scanner(System.in);
		double secondXData = input.nextDouble();
		double secondYData = input.nextDouble();

		double parentahesis1 = secondXData - firstXData;
		double parentahesis2 = secondYData - firstYData;
		double answer = Math.sqrt(Math.pow(parentahesis1,2) + Math.pow(parentahesis2,2));

		System.out.println(answer);

	}
}