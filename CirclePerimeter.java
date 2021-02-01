// Name: Jenna Adams
// Lab Partner: Zachary Wallace
// Course and lab: CPSC 1061 - Lab 2
// Date: Jan 20, 2021
// Description: CirclePerimeter.java computes and displays the perimeter of a circle with a radius of 1.5cm in a sentence.

// ----------------------------------------------------------------

public class CirclePerimeter {
	public static void main (String[] args) {
		final double PI = 3.14159;
		double radius = 1.5;
		double perimeter = 2 * PI * radius;
		System.out.println("The perimeter of a circle with a radius of " + radius + "cm is " + perimeter + "cm.");
	}
}