// Name: Jenna Adams
// Lab Partner: Brandon Lackey
// Course and lab: CPSC 1061 - Lab 3
// Date: Jan 27, 2021
// Description: Ants.java saves the number of ants on Earth as an
// int and displays the result. I will also be shown using variable 
// type long, and then the most approprate variable type.

// ----------------------------------------------------------------

public class Ants {
	public static void main (String[] args) {

		int antInt = (int)5e15;
		long antLong = (long)5e15;
		double antDouble = (double)5e30;

		System.out.println("There are " + antInt + " ants on Earth.");
		System.out.println("There are " + antLong + " ants on Earth.");
		System.out.println("There are " + antDouble + " bacteria on Earth.");

	}
}